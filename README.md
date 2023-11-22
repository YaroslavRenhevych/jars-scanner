# jars-scanner
Bulk jars scanning using jdeps, jdeps-jdkinternal and jdeprscan

# Removed java API from java 9 to java 17
API Removed in Java SE 17
Packages:
	java.rmi.activation

Classes :
          java.rmi.activation.Activatable () 
          java.rmi.activation.ActivationDesc () 
          java.rmi.activation.ActivationGroup () 
          java.rmi.activation.ActivationGroup_Stub () 
          java.rmi.activation.ActivationGroupDesc () 
          java.rmi.activation.ActivationGroupID () 
          java.rmi.activation.ActivationID () 
          java.rmi.activation.ActivationInstantiator () 
          java.rmi.activation.ActivationMonitor () 
          java.rmi.activation.ActivationSystem () 
          java.rmi.activation.Activator ()   

sun.misc.Unsafe::defineAnonymousClass

API Removed in Java SE 16
Constructor:
javax.tools.ToolProvider.<init>()          

java.awt.PeerFixer

APIs Removed in Java SE 15
Fields:
	java.management.rmi.RMIConnectorServer.CREDENTIAL_TYPES
Constructors:
	java.lang.invoke.ConstantBootstraps.<init> 
    	java.lang.reflect.Modifier.<init>          

Class SocketFlow

SSLSession.getPeerCertificateChain() method

APIs Removed in Java SE 14
Packages:
	java.security.acl
Interfaces:
	java.security.acl.Acl
	java.security.acl.AclEntry
	java.security.acl.Group
	java.security.acl.Owner
	java.security.acl.Permission
	java.util.jar.Pack200.Packer    
	java.util.jar.Pack200.Unpacker            
Classes:
	java.util.jar.Pack200
 
https://www.oracle.com/java/technologies/javase/14-relnote-issues.html#NewFeature:~:text=Removal%20of%20netscape.javascript.JSObjectgetWindow%20Method

netscape.javascript.JSObject::getWindow method
netscape.javascript.JSObject.getWindow


APIs Removed in Java SE 13
java.lang.Runtime.traceInstructions(boolean)      -> java/lang/Runtime::traceMethodCalls(Z)
java.lang.Runtime.traceMethodCalls(boolean)
com.sun.net.ssl   (not com.sun.net.ssl.internal.ssl.Provider)
jdk.scripting.nashorn
jdk.nashorn.api.scripting
jdk.nashorn.api.tree
jdk.scripting.nashorn.shell


Module jdk.javadoc. Packages: 	
com.sun.javadoc
com.sun.tools.doclets
com.sun.tools.doclets.standard
com.sun.tools.javadoc



APIs Removed in Java SE 12
            java.io.FileInputStream.finalize()
            java.io.FileOutputStream.finalize()
            java.util.zip.Deflater.finalize()       
            java.util.zip.Inflater.finalize()      
            java.util.zip.ZipFile.finalize()
     
com.sun.awt.SecurityWarning


APIs Removed in JDK 11
javax.security.auth.Policy
java.lang.Runtime.runFinalizersOnExit(boolean)
java.lang.SecurityManager.checkAwtEventQueueAccess() 
java.lang.SecurityManager.checkMemberAccess(java.lang.Class,int)
java.lang.SecurityManager.checkSystemClipboardAccess()
java.lang.SecurityManager.checkTopLevelWindow(java.lang.Object)
java.lang.System.runFinalizersOnExit(boolean)
java.lang.Thread.destroy()
java.lang.Thread.stop(java.lang.Throwable)

com.sun.awt.AWTUtilities
sun.misc.Unsafe.defineClass

The removed modules were:

Module java.xml.ws with packages: 
javax.xml.ws
javax.xml.ws.handler
javax.xml.ws.handler.soap
javax.xml.ws.http
javax.xml.ws.soap
javax.xml.ws.spi
javax.xml.ws.spi.http
javax.xml.ws.wsaddressing  

Module java.xml.bind (Java Architecture for XML Binding (JAXB))  with packages: 
javax.xml.bind 
javax.xml.bind.annotation
javax.xml.bind.annotation.adapters
javax.xml.bind.attachment
javax.xml.bind.helpers
javax.xml.bind.util  

Module java.xml.ws.annotation with package: 
javax.annotation 

Modile java.corba with packages: 
javax.activity 
javax.rmi 
javax.rmi.CORBA 
org.omg.CORBA 
org.omg.CORBA_2_3 
org.omg.CORBA_2_3.portable
org.omg.CORBA.DynAnyPackage
org.omg.CORBA.ORBPackage
org.omg.CORBA.portable
org.omg.CORBA.TypeCodePackage
org.omg.CosNaming
org.omg.CosNaming.NamingContextExtPackage
org.omg.CosNaming.NamingContextPackage
org.omg.Dynamic
org.omg.DynamicAny
org.omg.DynamicAny.DynAnyFactoryPackage
org.omg.DynamicAny.DynAnyPackage
org.omg.IOP
org.omg.IOP.CodecFactoryPackage
org.omg.IOP.CodecPackage
org.omg.Messaging
org.omg.PortableInterceptor
org.omg.PortableInterceptor.ORBInitInfoPackage
org.omg.PortableServer
org.omg.PortableServer.CurrentPackage
org.omg.PortableServer.POAManagerPackage
org.omg.PortableServer.POAPackage
org.omg.PortableServer.portable
org.omg.PortableServer.ServantLocatorPackage
org.omg.SendingContext
org.omg.stub.java.rmi

Moduel java.transaction: The subset of the Java Transaction API defined by Java SE to support CORBA Object Transaction Services with package:
javax.transaction

Moduel java.activation: JavaBeans Activation Framework with package:
javax.activation

Module java.se.ee: Aggregator module for the six modules above
Module jdk.xml.ws: Tools for JAX-WS
Moduel jdk.xml.bind: Tools for JAXB


APIs Removed in JDK 10
com.sun.java.browser.plugin2.DOM
sun.plugin.dom.DOMObject

Runtime.getLocalizedInputStream
Runtime.getLocalizedOutputStream

HostServices::getWebContext method

field java.lang.SecurityManager.inCheck 
Method java.lang.SecurityManager.getInCheck 
Method java.lang.SecurityManager.classDepth
Method java.lang.SecurityManager.classLoaderDepth
Method java.lang.SecurityManager.currentClassLoader
Method java.lang.SecurityManager.currentLoadedClass
Method java.lang.SecurityManager.inClass
Method java.lang.SecurityManager.inClassLoader

method java.lang.SecurityManager.checkMemberAccess method has been changed to throw a SecurityException if the caller has not been granted AllPermission


* 		com.sun.security.auth.PolicyFile
* 		com.sun.security.auth.SolarisNumericGroupPrincipal
* 		com.sun.security.auth.SolarisNumericUserPrincipal
* 		com.sun.security.auth.SolarisPrincipal
* 		com.sun.security.auth.X500Principal
* 		com.sun.security.auth.module.SolarisLoginModule
* 		com.sun.security.auth.module.SolarisSystem


APIs Removed JDK 9

com.sun.image.codec.jpeg

java.util.logging.LogManager.addPropertyChangeListener
java.util.logging.LogManager.removePropertyChangeListener
java.util.jar.Pack200.Packer.addPropertyChangeListener
java.util.jar.Pack200.Packer.removePropertyChangeListener
java.util.jar.Pack200.Unpacker.addPropertyChangeListener
java.util.jar.Pack200.Unpacker.removePropertyChangeListener

sun.misc.BASE64Encoder
sun.misc.BASE64Decoder

sun.nio.sh.PollSelectorProvider

javax.management.remote.rmi.RMIIIOPServerImpl
org.omg.stub.javax.management.rmi._RMIConnection_Stub
org.omg.stub.javax.management.rmi._RMIConnection_Tie

JFrame.EXIT_ON_CLOS

sun.misc.Unsafe.monitorEnter
sun.misc.Unsafe.monitorExit
sun.misc.Unsafe.tryMonitorEnter

com.apple.concurrent
apple.applescript
com.apple.concurrent.Dispatch

Annotation jdk.Exported

ExemptionMechanism.finalize()

com.sun.security.auth.callback.DialogCallbackHandler


# Removed JDK internal API
com.sun.org.apache.xerces.internal.impl.Version

com.sun.org.apache.xml.internal.resolver.Catalog
com.sun.org.apache.xml.internal.resolver.CatalogManager
com.sun.org.apache.xml.internal.resolver.tools.CatalogResolver
com.sun.org.apache.xml.internal.resolver.Catalog
com.sun.org.apache.xml.internal.resolver.CatalogManager
com.sun.org.apache.xml.internal.resolver.tools.CatalogResolver

com.sun.net.ssl.KeyManager
com.sun.net.ssl.SSLContext
com.sun.net.ssl.TrustManager
com.sun.net.ssl.X509TrustManager
com.sun.net.ssl.KeyManager
com.sun.net.ssl.KeyManagerFactory
com.sun.net.ssl.SSLContext
com.sun.net.ssl.TrustManager
com.sun.net.ssl.TrustManagerFactory
com.sun.net.ssl.internal.ssl.Provider

sun.security.provider.Sun

sun.security.action.GetPropertyAction

sun.misc.Perf
sun.misc.BASE64Decoder
sun.misc.BASE64Encoder
sun.misc.VM
sun.misc.UUEncoder
sun.misc.ClassFileTransformer
sun.misc.JavaNetAccess
sun.misc.Resource
sun.misc.SharedSecrets
sun.misc.URLClassPath
sun.misc.Resource
sun.misc.ExtensionInfo
sun.misc.ExtensionInstallationException
sun.misc.ExtensionInstallationException
sun.misc.ExtensionInstallationProvider




com.sun.java.swing.plaf.windows.WindowsButtonUI
com.sun.java.swing.plaf.windows.WindowsComboBoxUI
com.sun.java.swing.plaf.windows.WindowsTextFieldUI
com.sun.java.swing.plaf.windows.WindowsLookAndFeel
com.sun.java.swing.plaf.windows.WindowsMenuBarUI
com.sun.java.swing.plaf.windows.WindowsPasswordFieldUI
com.sun.java.swing.plaf.windows.WindowsPopupMenuUI
com.sun.java.swing.plaf.windows.WindowsScrollBarUI
com.sun.java.swing.plaf.windows.WindowsScrollPaneUI
com.sun.java.swing.plaf.windows.WindowsSpinnerUI
com.sun.java.swing.plaf.windows.WindowsSplitPaneUI
com.sun.java.swing.plaf.windows.WindowsTabbedPaneUI
com.sun.java.swing.plaf.windows.WindowsTextAreaUI
com.sun.java.swing.plaf.windows.WindowsTextFieldUI
com.sun.java.swing.plaf.windows.WindowsTreeUI
com.sun.java.swing.plaf.windows.WindowsMenuUI
com.sun.java.swing.plaf.windows.WindowsTableHeaderUI
com.sun.java.swing.plaf.windows.WindowsToolBarUI


com.sun.image.codec.jpeg.JPEGCodec
com.sun.image.codec.jpeg.JPEGEncodeParam
com.sun.image.codec.jpeg.JPEGImageEncoder
com.sun.image.codec.jpeg.JPEGCodec
com.sun.image.codec.jpeg.JPEGImageDecoder
com.sun.image.codec.jpeg.TruncatedFileException
com.sun.image.codec.jpeg.JPEGEncodeParam
com.sun.image.codec.jpeg.JPEGCodec
com.sun.image.codec.jpeg.JPEGDecodeParam
com.sun.image.codec.jpeg.JPEGImageDecoder
com.sun.image.codec.jpeg.JPEGCodec
com.sun.image.codec.jpeg.JPEGDecodeParam
com.sun.image.codec.jpeg.JPEGEncodeParam
com.sun.image.codec.jpeg.JPEGImageEncoder
com.sun.image.codec.jpeg.JPEGQTable

sun.io.ByteToCharConverter
sun.io.ConversionBufferFullException
sun.io.MalformedInputException
sun.io.UnknownCharacterException
sun.io.CharToByteConverter
sun.io.ConversionBufferFullException

sun.awt.windows.WEmbeddedFrame
sun.awt.windows.WComponentPeer

sun.awt.DesktopBrowse
sun.awt.AWTSecurityManager


com.sun.java.browser.dom.DOMAccessor
com.sun.java.browser.dom.DOMServiceProvider
com.sun.java.browser.dom.DOMAccessException
com.sun.java.browser.dom.DOMAction
com.sun.java.browser.dom.DOMService
com.sun.java.browser.dom.DOMUnsupportedException

com.sun.java.browser.net.ProxyInfo

com.apple.eawt.Application   
com.apple.eawt.ApplicationAdapter
com.apple.eawt.ApplicationEvent
com.apple.eawt.ApplicationListener

com.sun.jmx.mbeanserver.StandardMetaDataImpl

# Removed options from java and javac tools

https://www.oracle.com/java/technologies/javase/9-relnotes.html#:~:text=The%20java%20%2DXbootclasspath%20and%20%2DXbootclasspath/p%20options%20have%20been%20removed.

The java -Xbootclasspath and -Xbootclasspath/p options have been removed.


https://docs.oracle.com/en/java/javase/17/migrate/migrating-jdk-8-later-jdk-releases.html#GUID-1F270BDA-50B0-49C8-807E-0B727CCC5169:~:text=tuning%20G1%20GC.-,Removed%20GC%20Options,-The%20following%20GC

-Xincgc
-XX:+CMSIncrementalMode
-XX:+UseCMSCompactAtFullCollection
-XX:+CMSFullGCsBeforeCompaction
-XX:+UseCMSCollectionPassing

The command-line flag -XX:+UseParNewGC no longer has an effect

https://docs.oracle.com/en/java/javase/17/migrate/migrating-jdk-8-later-jdk-releases.html#GUID-055EA9F4-835E-463F-B9E1-9081B3D9E55D:~:text=Removed%20Permanent%20Generation

Removed Permanent Generation
* -XX:MaxPermSize=size
* -XX:PermSize=size


REMOVED IN JAVA 9:

https://www.oracle.com/java/technologies/javase/9-relnotes.html#Removed:~:text=Remove%20SafepointPollOffset%20flag
-XX:SafepointPollOffset

https://www.oracle.com/java/technologies/javase/9-relnotes.html#Removed:~:text=Remove%20BackEdgeThreshold%20flag
-XX:BackEdgeThreshold

https://www.oracle.com/java/technologies/javase/9-relnotes.html#Removed:~:text=Remove%20EnableInvokeDynamic%20flag
-XX:EnableInvokeDynamic

https://www.oracle.com/java/technologies/javase/9-relnotes.html#Removed:~:text=Remove%20Use486InstrsOnly%20flag
-XX:+Use486InstrsOnly

https://www.oracle.com/java/technologies/javase/9-relnotes.html#Removed:~:text=Remove%20deprecated%20command%20line%20flags

CMSParPromoteBlocksToClaim
ParCMSPromoteBlocksToClaim
ParallelGCOldGenAllocBufferSize
ParallelGCToSpaceAllocBufferSize
UseGCTimeLimit
CMSPermGenSweepingEnabled
ResizeTLE
PrintTLE
TLESize
UseTLE
MaxTLERatio
TLEFragmentationRatio
TLEThreadRatio


https://www.oracle.com/java/technologies/javase/9-relnotes.html#Removed:~:text=Various%20GC%20combinations%20have%20now%20been%20removed

Xincgc
-XX:+CMSIncrementalMode, 
-XX:+UseCMSCompactAtFullCollection
-XX:+CMSFullGCsBeforeCompaction
-XX:+UseCMSCollectionPassing

https://www.oracle.com/java/technologies/javase/9-relnotes.html#Removed:~:text=VM%20Options%20AdjustConcurrency%20and%20PrintJVMWarnings%20are%20removed

-XX:AdjustConcurrency
-XX:PrintJVMWarnings


https://www.oracle.com/java/technologies/javase/9-relnotes.html#Removed:~:text=Remove%20Launch%2DTime%20JRE%20Version%20Selection

"-version:x.y.z", "-jre-restrict-search" and "-jre-no-restrict-search"




REMOVED IN JAVA 10
https://www.oracle.com/java/technologies/javase/10-relnote-issues.html#NewFeature:~:text=Removal%20of%20Obsolete%20%2DX%20Options

-Xoss, -Xsqnopause, -Xoptimize, -Xboundthreads, and -Xusealtsigs

https://www.oracle.com/java/technologies/javase/10-relnote-issues.html#NewFeature:~:text=Removal%20of%20Java%20Launcher%27s%20Data%20Model%20Options%20%2Dd32%20and%20%2Dd64

-d32, -d64, -J-d32 and -J-d64

https://docs.oracle.com/en/java/javase/17/migrate/removed-tools-and-components.html#GUID-12237744-E23B-42F8-8892-26BA1BDD63F2:~:text=with%20the%20JDK.-,Removed%20Native%2DHeader%20Generation%20Tool%20(javah),-The%20javah%20tool

javac -h

REMOVED IN JAVA 11
 the following com.sun.management.snmp.* properties are no-op when set by using the -D option or the management.properties configuration.
* 		com.sun.management.snmp.port
* 		com.sun.management.snmp.trap
* 		com.sun.management.snmp.interface
* 		com.sun.management.snmp.acl
* 		com.sun.management.snmp.acl.file



REMOVED IN JAVA 12

support for the 6/1.6 argument value for javac's -source, -target, and --release flags has been removed

REMOVED IN JAVA 13

https://www.oracle.com/java/technologies/javase/13-relnote-issues.html#NewFeature:~:text=Removal%20of%20VM%20option%20%2DXX%2BAggressiveOpts

-XX:+AggressiveOpts

--no-module-directories

REMOVED IN 14

-XX:UseConcMarkSweepGC and aliases -Xconcgc and -Xnoconcgc





REMOVED IN 15
-XXUseAdaptiveGCBoundary



REMOVED IN 16
-XX:+TraceClassLoading
-XX:+TraceClassUnloading
-XX:+TraceExceptions


REMOVED IN 17

https://www.oracle.com/java/technologies/javase/17-relnote-issues.html#NewFeature:~:text=JEP%20403%3A%20Strongly%20Encapsulate%20JDK%20Internals

--illegal-access
