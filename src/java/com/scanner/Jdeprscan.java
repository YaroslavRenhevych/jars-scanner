package org.example;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Jdeprscan {

    private static final List<String> removedAPIs = Arrays.asList(
            "java.rmi.activation",
            "java/rmi/activation",
            "defineAnonymousClass",
            "javax/tools/ToolProvider",
            "ToolProvider",
            "java/awt/PeerFixer",
            "java/management/rmi/RMIConnectorServer.CREDENTIAL_TYPES",
            "RMIConnectorServer",
            "CREDENTIAL_TYPES",
            "java/lang/invoke/ConstantBootstraps",
            "ConstantBootstraps",
            "java/lang/reflect/Modifier::<init>",
            "SocketFlow",
            "getPeerCertificateChain",
            "security/acl",
            "java/security/acl",
            "java/security/acl/Acl",
            "java/security/acl/AclEntry",
            "java/security/acl/Group",
            "java/security/acl/Owner",
            "java/security/acl/Permission",
            "java/util/jar/Pack200",
            "Pack200",
            "netscape/javascript/JSObject::getWindow",
            "netscape/javascript/JSObject",
            "traceInstructions",
            "traceMethodCalls",
            "java/lang/Runtime::traceMethodCalls(Z)",
            "/FileInputStream",
            "/FileOutputStream",
            "FileInputStream.finalize",
            "FileInputStream::finalize",
            "FileOutputStream.finalize",
            "FileOutputStream::finalize",
            "Deflater::finalize",
            "Inflater::finalize",
            "ZipFile::finalize",
            "Deflater",
            "Inflater",
            "auth/Policy",
            "javax/security/auth/Policy",
            "runFinalizersOnExit",
            "SecurityManager::checkSystemClipboardAccess()",
            "SecurityManager.checkSystemClipboardAccess()",
            "checkAwtEventQueueAccess",
            "checkMemberAccess",
            "checkSystemClipboardAccess",
            "checkTopLevelWindow",
            "runFinalizersOnExit",
            "Thread.destroy",
            "Thread:destroy",
            "Thread::destroy",
            "Thread.stop",
            "Thread:stop",
            "Thread::stop",
            "com/sun/java/browser/plugin2/DOM",
            "plugin2",
            "sun/plugin/dom/DOMObject",
            "DOMObject",

            "getLocalizedInputStream",
            "Runtime::getLocalizedInputStream",
            "Runtime::getLocalizedOutputStream",
            "getLocalizedOutputStream",

            "HostServices::getWebContext",
            "HostServices",

            "SecurityManager::inCheck",
            "inCheck",
            "SecurityManager::getInCheck",
            "getInCheck",
            "SecurityManager::classDepth",
            "classDepth",
            "SecurityManager::classLoaderDepth",
            "classLoaderDepth",
            "SecurityManager::currentClassLoader",
            "currentClassLoader",
            "SecurityManager::currentLoadedClass",
            "currentLoadedClass",
            "SecurityManager::inClass",
            "inClass",
            "SecurityManager::inClassLoader",
            "inClassLoader",
            "SecurityManager::checkMemberAccess", // throw a SecurityException if the caller has not been granted AllPermission
            "checkMemberAccess",

            "PolicyFile",
            "SolarisNumericGroupPrincipal",
            "SolarisNumericUserPrincipal",
            "SolarisPrincipal",
            "X500Principal",
            "SolarisLoginModule",
            "SolarisSystem",

            "com/sun/image/codec/jpeg",

            "addPropertyChangeListener",
            "java/util/logging/LogManager.addPropertyChangeListener",
            "java/util/logging/LogManager.removePropertyChangeListener",
            "removePropertyChangeListener",
            "Pack200",
            "misc/BASE64Encoder",
            "misc/BASE64Decoder",

            "sun/nio/sh/PollSelectorProvider",

            "jdk/scripting/nashorn",
            "jdk/nashorn/api/scripting",
            "jdk/nashorn/api/tree",
            "jdk/scripting/nashorn/shell",
            "nashorn",
            "com/sun/tools/javadoc/Start",
            "com/sun/tools/javadoc",
            "com/sun/javadoc",
            "com/sun/tools/doclets",
            "com/sun/tools/doclets/standard",
            "com/sun/tools/javadoc",


            "com/sun/net/ssl",
            "com/sun/awt/SecurityWarning",
            "com/sun/awt/AWTUtilities",
            "sun/misc/Unsafe.defineClass",
            "sun/misc.Unsafe$defineClass",
            "sun/misc/Unsafe#defineClass",
            "sun/misc/Unsafe:defineClass",
            "sun/misc/Unsafe::defineClass",

            "java/xml/ws",
            "javax/xml/ws",
            "javax/xml/ws/handler",
            "javax/xml/ws/handler/soap",
            "javax/xml/ws/http",
            "javax/xml/ws/soap",
            "javax/xml/ws/spi",
            "javax/xml/ws/spi/http",
            "javax/xml/ws/wsaddressing",


            "java/xml/bind",
            "javax/xml/bind",
            "javax/xml/bind/annotation",
            "javax/xml/bind/annotation/adapters",
            "javax/xml/bind/attachment",
            "javax/xml/bind/helpers",
            "javax/xml/bind/util",

            "java/xml/ws/annotation",
            "javax/annotation",

            "java/corba",
            "javax/activity",
            "javax/rmi",
            "javax/rmi/CORBA",
            "org/omg/CORBA",
            "org/omg/CORBA_2_3",
            "org/omg/CORBA_2_3/portable",
            "org/omg/CORBA/DynAnyPackage",
            "org/omg/CORBA/ORBPackage",
            "org/omg/CORBA/portable",
            "org/omg/CORBA/TypeCodePackage",
            "org/omg/CosNaming",
            "org/omg/CosNaming/NamingContextExtPackage",
            "org/omg/CosNaming/NamingContextPackage",
            "org/omg/Dynamic",
            "org/omg/DynamicAny",
            "org/omg/DynamicAny/DynAnyFactoryPackage",
            "org/omg/DynamicAny/DynAnyPackage",
            "org/omg/IOP",
            "org/omg/IOP/CodecFactoryPackage",
            "org/omg/IOP/CodecPackage",
            "org/omg/Messaging",
            "org/omg/PortableInterceptor",
            "org/omg/PortableInterceptor/ORBInitInfoPackage",
            "org/omg/PortableServer",
            "org/omg/PortableServer/CurrentPackage",
            "org/omg/PortableServer/POAManagerPackage",
            "org/omg/PortableServer/POAPackage",
            "org/omg/PortableServer/portable",
            "org/omg/PortableServer/ServantLocatorPackage",
            "org/omg/SendingContext",
            "org/omg/stub/java/rmi",

            "java/transaction",
            "javax/transaction",

            "java/activation",
            "javax/activation",

            "java/se/ee",
            "jdk/xml/ws",
            "jdk/xml/bind",

            "javax/management/remote/rmi/RMIIIOPServerImpl",
            "RMIIIOPServerImpl",
            "org/omg/stub/javax/management/rmi/_RMIConnection_Stub",
            "_RMIConnection_Stub",
            "org/omg/stub/javax/management/rmi/_RMIConnection_Tie",
            "_RMIConnection_Tie",

            "JFrame::EXIT_ON_CLOS",
            "EXIT_ON_CLOS",

            "sun/misc/Unsafe::monitorEnter",
            "monitorEnter",
            "sun/misc/Unsafe::monitorExit",
            "monitorExit",
            "sun/misc/Unsafe::tryMonitorEnter",
            "tryMonitorEnter",

            "com/apple/concurrent",
            "apple/applescript",
            "com/apple/concurrent/Dispatch",

            "jdk/Exported",
            "ExemptionMechanism::finalize",
            "ExemptionMechanism",

            "com/sun/security/auth/callback/DialogCallbackHandler",
            "DialogCallbackHandler",

            //internal APIs:
            "sun/misc/Perf",
            "com/sun/org/apache/xerces/internal/impl/Version",
            "com/sun/org/apache/xml/internal/resolver",
            "sun/security/provider/Sun",
            "sun/security/action/GetPropertyAction",
            "sun/misc",
            "com/sun/java/swing/plaf/windows",
            "com/sun/image/codec/jpeg",
            "sun/io",
            "sun/awt/windows",
            "sun/awt",
            "com/sun/java/browser/dom",
            "com/sun/java/browser/net/ProxyInfo"
    );

    public static void main(String[] args) throws IOException, InterruptedException {
        String folder = "/path/to/folder/with/jars";
        File directoryPath = new File(folder);
        List<String> fileNames = Stream.of(Objects.requireNonNull(directoryPath.list()))
                .filter(fileName -> !fileName.equals(".DS_Store"))
                .sorted()
                .toList();


        System.out.println("Number of files: " + fileNames.size());

        String outputFileName = folder.replace("/", "-") + "jdeprscan.txt";

        FileWriter fw = new FileWriter(outputFileName, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("START\n");
        List<Integer> javaVersions = List.of(8, 9, 10, 11, 12, 13, 14, 15, 16, 17);

        for (String fileName : fileNames) {
            Set<String> outputLines = new TreeSet<>();
            Set<String> removedAPIUsages = new TreeSet<>();

            for (int javaVersion : javaVersions) {
                System.out.println("File #" + fileNames.indexOf(fileName) + ": " + fileName + " for java " + javaVersion);

                Process process = Runtime.getRuntime().exec("/Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home/bin/jdeprscan --release " + javaVersion + " " + folder + fileName);

                StringBuilder output = new StringBuilder();
                StreamGobbler outputGobbler = new StreamGobbler(process.inputReader(), output);
                outputGobbler.start();

                StringBuilder errors = new StringBuilder();
                StreamGobbler errorGobbler = new StreamGobbler(process.errorReader(), errors);
                errorGobbler.start();

                int exitVal = process.waitFor();


                String outputStr = output.toString();
                String errorsStr = errors.toString();
                if (exitVal == 0) {
                    System.out.println("done");

                } else {
                    System.out.println("!!!!!!!!!!!!!!!!!!Error:");
                    System.out.println(outputStr);
                    System.out.println(errorsStr);
                }

                outputLines.addAll(
                        Arrays.stream(outputStr.split("\n"))
                                .filter(str -> removedAPIs.stream().anyMatch(str::contains))
                                .collect(Collectors.toSet())
                );
                outputLines.addAll(
                        Arrays.stream(errorsStr.split("\n"))
                                .filter(str -> removedAPIs.stream().anyMatch(str::contains))
                                .collect(Collectors.toSet())
                );

                removedAPIUsages.addAll(removedAPIs.stream()
                        .filter(api -> outputStr.contains(api) || errorsStr.contains(api))
                        .collect(Collectors.toSet()));
            }

            if (!removedAPIUsages.isEmpty()) {
                bw.write("File #" + fileNames.indexOf(fileName) + " " + fileName + "\n");
                bw.write("Found usages: " + removedAPIUsages + "\n");
                bw.write(String.join("\n", outputLines));

                bw.newLine();
                bw.newLine();
                bw.newLine();
                bw.flush();
            }
        }
        bw.write("END");
        bw.close();
    }
}
