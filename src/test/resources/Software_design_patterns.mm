<map version="0.9.0">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1189962612109" ID="Freemind_Link_993358220" MODIFIED="1189983152218" TEXT="Software design patterns">
<cloud/>
<font ITALIC="true" NAME="SansSerif" SIZE="14"/>
<icon BUILTIN="gohome"/>
<icon BUILTIN="bookmark"/>
<node COLOR="#006633" CREATED="1189962705125" ID="_" MODIFIED="1189964195828" POSITION="right" TEXT="clasification on usage">
<node COLOR="#006699" CREATED="1189962782281" ID="Freemind_Link_1836753634" LINK="http://en.wikipedia.org/wiki/Design_Patterns#Creational_patterns.2C_Chapter_3" MODIFIED="1325684898516" TEXT="Creational Patterns">
<node COLOR="#996600" CREATED="1189963345187" ID="Freemind_Link_1354432721" LINK="http://en.wikipedia.org/wiki/Abstract_factory_pattern#Java" MODIFIED="1189967065703" TEXT="Abstract Factory" VSHIFT="-37">
<node COLOR="#999999" CREATED="1189963386765" HGAP="22" ID="Freemind_Link_1290675353" MODIFIED="1189977015750" TEXT="Provide an interface for creating families of related or dependent objects without specifying their concrete classes." VSHIFT="-63">
<edge STYLE="bezier"/>
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
<node COLOR="#996600" CREATED="1189963349453" ID="Freemind_Link_506660031" LINK="http://en.wikipedia.org/wiki/Builder_pattern" MODIFIED="1189971188453" TEXT="Builder">
<node COLOR="#999999" CREATED="1189963419562" HGAP="25" ID="Freemind_Link_1469137371" MODIFIED="1189965010343" TEXT="Separate the construction of a complex object from its representation so that the same construction process can create different representations." VSHIFT="12">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node CREATED="1189965625890" ID="Freemind_Link_1643648119" MODIFIED="1189965628156" TEXT="creation of an aggregate&apos;s elements"/>
</node>
<node COLOR="#996600" CREATED="1189963370453" ID="Freemind_Link_515242072" LINK="http://en.wikipedia.org/wiki/Factory_method_pattern" MODIFIED="1189978102625" TEXT="Factory Method">
<icon BUILTIN="full-1"/>
<node COLOR="#999999" CREATED="1189963534312" ID="Freemind_Link_1355594844" MODIFIED="1189965031546" TEXT="Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node CREATED="1189966034750" ID="Freemind_Link_949524493" MODIFIED="1189977224156" TEXT="virtual creation through inheritance">
<font NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1189977226687" ID="Freemind_Link_1348651336" MODIFIED="1189977258671" TEXT="Descriptive names- avoid overloading"/>
<node COLOR="#3333ff" CREATED="1189977491593" ID="Freemind_Link_1749349534" MODIFIED="1189977514593" TEXT="Example: javax.xml.parsers.DocumentBuilderFactory"/>
<node CREATED="1189977547859" ID="Freemind_Link_929074262" MODIFIED="1189977575343" TEXT="limitations: extensibility -&gt; inheritance"/>
</node>
<node COLOR="#996600" CREATED="1189963379296" HGAP="24" ID="Freemind_Link_424810687" LINK="http://en.wikipedia.org/wiki/Prototype_pattern" MODIFIED="1189976649203" TEXT="Prototype" VSHIFT="20">
<icon BUILTIN="full-1"/>
<node COLOR="#999999" CREATED="1189963504031" ID="Freemind_Link_233814956" MODIFIED="1189965032171" TEXT="Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node CREATED="1189976671125" ID="Freemind_Link_1470477584" MODIFIED="1189976675421" TEXT="clone()"/>
</node>
<node COLOR="#996600" CREATED="1189963477171" ID="Freemind_Link_1932677154" LINK="http://en.wikipedia.org/wiki/Singleton_pattern" MODIFIED="1189976564546" TEXT="Singleton">
<icon BUILTIN="full-1"/>
<node COLOR="#999999" CREATED="1189963557640" ID="Freemind_Link_1228016985" MODIFIED="1189965033140" TEXT="Ensure a class only has one instance, and provide a global point of access to it.">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node CREATED="1189976722281" ID="Freemind_Link_1711809871" MODIFIED="1189976724468" TEXT="public static Singleton getInstance()"/>
<node CREATED="1189977874625" ID="Freemind_Link_434851821" LINK="http://en.wikipedia.org/wiki/Initialization_on_demand_holder_idiom" MODIFIED="1189977891015" TEXT="Initialization on demand holder idiom">
<node CREATED="1189978013468" ID="Freemind_Link_181222522" MODIFIED="1189978016296" TEXT="class initialization phase is guaranteed by the JLS to be serial"/>
</node>
</node>
</node>
<node COLOR="#006699" CREATED="1189962823718" ID="Freemind_Link_454145934" LINK="http://en.wikipedia.org/wiki/Design_Patterns#Structural_patterns.2C_Chapter_4" MODIFIED="1325684898501" TEXT="Structural Patterns" VSHIFT="64">
<node COLOR="#996600" CREATED="1189963600484" ID="Freemind_Link_703910577" LINK="http://en.wikipedia.org/wiki/Adapter_pattern" MODIFIED="1189978298093" TEXT="Adapter">
<node COLOR="#999999" CREATED="1189963618796" ID="Freemind_Link_811538353" MODIFIED="1189965034031" TEXT="Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn&apos;t otherwise because of incompatible interfaces.">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node CREATED="1189965700031" ID="Freemind_Link_584211743" MODIFIED="1189965702187" TEXT="wrap a legacy component"/>
</node>
<node COLOR="#996600" CREATED="1189963630625" ID="Freemind_Link_526274075" LINK="http://en.wikipedia.org/wiki/Bridge_pattern" MODIFIED="1189978327546" TEXT="Bridge">
<node COLOR="#999999" CREATED="1189963645062" ID="Freemind_Link_88302274" MODIFIED="1189965034718" TEXT="Decouple an abstraction from its implementation so that the two can vary independently.">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node CREATED="1189965719531" ID="Freemind_Link_898136662" MODIFIED="1189965719531" TEXT="decouple interface and implementation"/>
</node>
<node COLOR="#996600" CREATED="1189963666593" ID="Freemind_Link_1563017875" LINK="http://en.wikipedia.org/wiki/Composite_pattern" MODIFIED="1189978798687" TEXT="Composite">
<icon BUILTIN="full-1"/>
<node COLOR="#999999" CREATED="1189963676875" ID="Freemind_Link_899999172" MODIFIED="1189965035328" TEXT="Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node CREATED="1189965735859" ID="Freemind_Link_1923805255" MODIFIED="1189965735859" TEXT="recursive composition"/>
<node COLOR="#3333ff" CREATED="1189977491593" ID="Freemind_Link_963485849" MODIFIED="1189978771750" TEXT="Example: javax.management.CompositeData"/>
</node>
<node COLOR="#996600" CREATED="1189963708687" ID="Freemind_Link_446681827" LINK="http://en.wikipedia.org/wiki/Decorator_pattern" MODIFIED="1189979266125" TEXT="Decorator ">
<node COLOR="#999999" CREATED="1189963712125" ID="Freemind_Link_1817770510" MODIFIED="1189965036281" TEXT="Composite     Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly. ">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node CREATED="1189978986671" ID="Freemind_Link_794143923" MODIFIED="1189978989187" TEXT="scrollbar is the &quot;decoration&quot; to the webpage"/>
</node>
<node COLOR="#996600" CREATED="1189963726281" ID="Freemind_Link_48204585" LINK="http://en.wikipedia.org/wiki/Facade_pattern" MODIFIED="1189979305187" TEXT="Facade ">
<icon BUILTIN="full-1"/>
<node COLOR="#999999" CREATED="1189963736953" ID="Freemind_Link_110265398" MODIFIED="1189965039140" TEXT="Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node CREATED="1189965886062" MODIFIED="1189965886062" TEXT="simple front-end to a complicated subsystem"/>
</node>
<node COLOR="#996600" CREATED="1189963746531" ID="Freemind_Link_1821942374" LINK="http://en.wikipedia.org/wiki/Flyweight_pattern" MODIFIED="1189979348187" TEXT="Flyweight ">
<node COLOR="#999999" CREATED="1189963757625" ID="Freemind_Link_804724819" MODIFIED="1189965039781" TEXT="Use sharing to support large numbers of fine-grained objects efficiently.">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node CREATED="1189965816671" ID="Freemind_Link_1730589302" MODIFIED="1189965816671" TEXT="use sharing to optimize lots of &quot;little&quot; objects"/>
<node CREATED="1189980008078" ID="Freemind_Link_1163887262" MODIFIED="1189980068843" TEXT="use hashmap (week) to cache, override equals, hashcode"/>
</node>
<node COLOR="#996600" CREATED="1189963778921" ID="Freemind_Link_1242043920" LINK="http://en.wikipedia.org/wiki/Proxy_pattern" MODIFIED="1189979400875" TEXT="Proxy ">
<icon BUILTIN="full-1"/>
<node COLOR="#999999" CREATED="1189963789125" ID="Freemind_Link_205241534" MODIFIED="1189965040203" TEXT="Provide a surrogate or placeholder for another object to control access to it.">
<font NAME="SansSerif" SIZE="10"/>
</node>
</node>
</node>
<node COLOR="#006699" CREATED="1189963816281" ID="Freemind_Link_1189362202" LINK="http://en.wikipedia.org/wiki/Design_Patterns#Behavioral_patterns.2C_Chapter_5" MODIFIED="1189967611875" TEXT="Behavioral Patterns" VSHIFT="63">
<node COLOR="#996600" CREATED="1189964360859" ID="Freemind_Link_740403003" LINK="http://en.wikipedia.org/wiki/Chain-of-responsibility_pattern" MODIFIED="1189981530828" TEXT="Chain of Responsibility">
<icon BUILTIN="full-2"/>
<node COLOR="#999999" CREATED="1189964366671" ID="Freemind_Link_476340326" MODIFIED="1189965041171" TEXT="Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node CREATED="1189966132828" ID="ID_1380145014" MODIFIED="1189966132828" TEXT="single processing pipe, many possible handlers"/>
</node>
<node COLOR="#996600" CREATED="1189964386546" ID="Freemind_Link_1529461123" LINK="http://en.wikipedia.org/wiki/Command_pattern" MODIFIED="1325684898477" TEXT="Command">
<icon BUILTIN="full-2"/>
<node COLOR="#999999" CREATED="1189964399218" ID="Freemind_Link_1055170671" MODIFIED="1189965041546" TEXT="Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node BACKGROUND_COLOR="#ccffcc" CREATED="1189965400906" ID="Freemind_Link_1331959820" MODIFIED="1189966162968" TEXT="Analogy: meal order at a restaurant"/>
<node CREATED="1189966173937" MODIFIED="1189966173937" TEXT="encapsulate a request as an object"/>
<node CREATED="1190060902234" ID="Freemind_Link_171464828" LINK="gof_command.jpg" MODIFIED="1190060945828" TEXT="uml"/>
<node CREATED="1190061173515" ID="Freemind_Link_582209810" MODIFIED="1190061252859" TEXT="thread pool class works with an internal queue of tasks waiting to be done. Tasks are Command objects."/>
<node CREATED="1190061358406" ID="Freemind_Link_1087873087" MODIFIED="1190061360656" TEXT="Parallel Processing"/>
</node>
<node COLOR="#996600" CREATED="1189964458671" ID="Freemind_Link_147322658" LINK="http://en.wikipedia.org/wiki/Strategy_pattern" MODIFIED="1190061671687" TEXT="Strategy">
<icon BUILTIN="full-2"/>
<node COLOR="#999999" CREATED="1189964471625" ID="Freemind_Link_1654246466" MODIFIED="1189965041921" TEXT="Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node CREATED="1190061723171" ID="Freemind_Link_194173133" MODIFIED="1190061768265" TEXT="plug-compatible algorithms; &#xa;algorithms can be selected on-the-fly at runtime;"/>
<node CREATED="1190062019562" ID="Freemind_Link_1472804553" MODIFIED="1190062021500" TEXT="uses composition instead of inheritance."/>
<node CREATED="1190062027718" ID="Freemind_Link_469648282" MODIFIED="1190062072234" TEXT="Example - Routing Strategies: Static, Dinamic"/>
</node>
<node COLOR="#996600" CREATED="1189964499953" ID="Freemind_Link_275373763" LINK="http://en.wikipedia.org/wiki/Observer_pattern" MODIFIED="1190061501187" TEXT="Observer">
<icon BUILTIN="full-1"/>
<node COLOR="#999999" CREATED="1189964531453" ID="Freemind_Link_1921563663" MODIFIED="1189965042265" TEXT="Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node BACKGROUND_COLOR="#ccffcc" CREATED="1189965400906" ID="Freemind_Link_1547761289" MODIFIED="1189966271296" TEXT="Analogy: news subsscription"/>
<node CREATED="1190061274968" ID="Freemind_Link_1095158846" MODIFIED="1190061279203" TEXT="Listener"/>
</node>
<node COLOR="#996600" CREATED="1189964554812" ID="Freemind_Link_1847697840" LINK="http://en.wikipedia.org/wiki/State_pattern" MODIFIED="1190062952359" TEXT="State">
<node COLOR="#999999" CREATED="1189964577437" ID="Freemind_Link_1008802981" MODIFIED="1189965042593" TEXT="Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node CREATED="1189966324937" ID="Freemind_Link_569004776" MODIFIED="1189966324937" TEXT="object&apos;s behavior morphs as its state changes"/>
<node CREATED="1190062699296" ID="Freemind_Link_1312939545" MODIFIED="1190062706656" TEXT="State is more dynamic than strategy"/>
</node>
<node COLOR="#996600" CREATED="1189964602031" ID="Freemind_Link_794396841" LINK="http://en.wikipedia.org/wiki/Memento_pattern" MODIFIED="1190059500718" TEXT="Memento">
<node COLOR="#999999" CREATED="1189964611984" ID="Freemind_Link_1649653626" MODIFIED="1189965043421" TEXT="Without violating encapsulation, capture and externalize an object&apos;s internal state so that the object can be restored to this state later.">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node CREATED="1189966387937" ID="Freemind_Link_1024503802" MODIFIED="1189966387937" TEXT="checkpoint/rollback an object&apos;s internal state"/>
</node>
<node COLOR="#996600" CREATED="1189964628578" ID="Freemind_Link_1520885186" LINK="http://en.wikipedia.org/wiki/Iterator_pattern" MODIFIED="1190062989015" TEXT="Iterator">
<icon BUILTIN="full-1"/>
<node COLOR="#999999" CREATED="1189964639015" ID="Freemind_Link_1639737507" MODIFIED="1189965044093" TEXT="Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node BACKGROUND_COLOR="#ccffcc" CREATED="1189965400906" ID="Freemind_Link_1851634827" MODIFIED="1189966422031" TEXT="Analogy: secr accessing her file system"/>
<node CREATED="1189966432562" ID="ID_705200109" MODIFIED="1189966432562" TEXT="decouple traversal of an aggregate object"/>
</node>
<node COLOR="#996600" CREATED="1189964669109" ID="Freemind_Link_1956221684" LINK="http://en.wikipedia.org/wiki/Interpreter_pattern" MODIFIED="1190065999875" TEXT="Interpreter">
<node COLOR="#999999" CREATED="1189964705671" ID="Freemind_Link_926442615" MODIFIED="1189965044781" TEXT="Given a language, define a represention for its grammar along with an interpreter that uses the representation to interpret sentences in the language.">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node BACKGROUND_COLOR="#ccffcc" CREATED="1189965400906" ID="Freemind_Link_639890170" MODIFIED="1189966479484" TEXT="Analogy: musician reading music"/>
</node>
<node COLOR="#996600" CREATED="1189964735796" ID="Freemind_Link_1282025016" LINK="http://en.wikipedia.org/wiki/Visitor_pattern" MODIFIED="1190063624859" TEXT="Visitor">
<node COLOR="#999999" CREATED="1189964766718" ID="Freemind_Link_1163319410" MODIFIED="1189965045734" TEXT="Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node CREATED="1189966529812" ID="Freemind_Link_1132849780" MODIFIED="1189966529812" TEXT="decouple operations on an aggregate object"/>
<node CREATED="1190063571312" ID="Freemind_Link_1188198017" MODIFIED="1190063574500" TEXT="ability to add new operations to existing object structures without modifying those structures"/>
<node CREATED="1190065461515" ID="Freemind_Link_275138774" LINK="http://www.exciton.cs.rice.edu/JAvaResources/DesignPatterns/VisitorPattern.htm" MODIFIED="1190065476265" TEXT="The Visitor Design Pattern"/>
</node>
<node COLOR="#996600" CREATED="1189964782812" ID="Freemind_Link_931284991" LINK="http://en.wikipedia.org/wiki/Template_method_pattern" MODIFIED="1190065967718" TEXT="Template Method">
<icon BUILTIN="full-1"/>
<node COLOR="#999999" CREATED="1189964798109" ID="Freemind_Link_1244081691" MODIFIED="1189965046546" TEXT="Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm&apos;s structure.">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node CREATED="1189966556187" ID="Freemind_Link_1416000032" MODIFIED="1189966556187" TEXT="constant algorithm, replaceable steps"/>
</node>
<node COLOR="#996600" CREATED="1189964811765" ID="Freemind_Link_1229183178" LINK="http://en.wikipedia.org/wiki/Mediator_pattern" MODIFIED="1190062918515" TEXT="Mediator">
<icon BUILTIN="full-2"/>
<node COLOR="#999999" CREATED="1189964844859" ID="Freemind_Link_1340371893" MODIFIED="1189965047296" TEXT="Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.">
<font NAME="SansSerif" SIZE="10"/>
</node>
<node BACKGROUND_COLOR="#ccffcc" CREATED="1189965400906" ID="Freemind_Link_1005431863" MODIFIED="1189965525343" TEXT="Analogy:  airport control tower"/>
</node>
</node>
<node COLOR="#000000" CREATED="1189964256750" ID="Freemind_Link_1774784719" LINK="Concurrency%20pattern" MODIFIED="1325684898467" TEXT="Concurrency patterns">
<icon BUILTIN="pencil"/>
<node COLOR="#996600" CREATED="1189980220031" ID="Freemind_Link_910534755" LINK="http://en.wikipedia.org/wiki/Thread_pool_pattern" MODIFIED="1189982932671" TEXT="Thread pool pattern"/>
<node COLOR="#996600" CREATED="1189980423765" ID="Freemind_Link_1018591199" LINK="http://en.wikipedia.org/wiki/Double_checked_locking_pattern" MODIFIED="1189982934062" TEXT="Double-checked locking">
<icon BUILTIN="clanbomber"/>
<node CREATED="1189980627234" ID="Freemind_Link_1772456072" MODIFIED="1189980678562" TEXT="will work with volatile in &gt;= j2se5.0"/>
<node CREATED="1189980849546" ID="Freemind_Link_1800307513" MODIFIED="1189980852531" TEXT="The &quot;Double-Checked Locking is Broken&quot; Declaration"/>
<node CREATED="1189980922375" ID="Freemind_Link_1518703647" MODIFIED="1189980924093" TEXT="Just define the singleton as a static field in a separate class."/>
<node CREATED="1189980950500" ID="Freemind_Link_1716237648" MODIFIED="1189980953062" TEXT="It will work for 32-bit primitive values"/>
</node>
<node COLOR="#996600" CREATED="1189981218515" ID="Freemind_Link_439015138" LINK="http://en.wikipedia.org/wiki/Read_write_lock_pattern" MODIFIED="1189982934984" TEXT="Read/write lock pattern"/>
<node COLOR="#996600" CREATED="1189981315015" ID="Freemind_Link_392838377" LINK="http://en.wikipedia.org/wiki/Thread-local_storage" MODIFIED="1189982935781" TEXT="Thread-local storage">
<node CREATED="1189981441843" ID="Freemind_Link_1983247890" MODIFIED="1189981443796" TEXT="ThreadLocal&lt;Integer&gt; local = new ThreadLocal&lt;Integer&gt;();"/>
</node>
<node COLOR="#996600" CREATED="1189981622718" ID="Freemind_Link_1999504871" LINK="http://en.wikipedia.org/wiki/Monitor_%28synchronization%29" MODIFIED="1189982938406" TEXT="Monitor (synchronization)">
<node CREATED="1189981922859" ID="Freemind_Link_28890120" MODIFIED="1189982010812" TEXT="lock.acquire(); lock.release();"/>
<node CREATED="1189982013359" MODIFIED="1189982013359" TEXT="Hoare vs. Mesa semantics"/>
</node>
<node COLOR="#996600" CREATED="1189982179125" ID="Freemind_Link_427776928" LINK="http://en.wikipedia.org/wiki/Reactor_pattern" MODIFIED="1189982939093" TEXT="Reactor pattern"/>
<node COLOR="#996600" CREATED="1189982294640" ID="Freemind_Link_1257251158" LINK="http://en.wikipedia.org/wiki/Active_Object" MODIFIED="1189982939625" TEXT="Active Object"/>
<node COLOR="#996600" CREATED="1189982360187" ID="Freemind_Link_1482754434" LINK="http://en.wikipedia.org/wiki/Balking_pattern" MODIFIED="1189982940265" TEXT="Balking pattern">
<node CREATED="1189982347765" ID="Freemind_Link_3080664" MODIFIED="1189982347765" TEXT="IllegalStateException"/>
</node>
<node COLOR="#996600" CREATED="1189982430718" ID="Freemind_Link_683413729" LINK="http://en.wikipedia.org/wiki/Guarded_suspension" MODIFIED="1189982943781" TEXT="Guarded suspension"/>
<node COLOR="#996600" CREATED="1189982698046" ID="Freemind_Link_1980403316" LINK="http://en.wikipedia.org/w/index.php?title=Leaders_followers_pattern&amp;amp" MODIFIED="1189982943140" TEXT="Leaders/followers pattern"/>
</node>
</node>
<node CREATED="1189966859453" ID="Freemind_Link_1341653219" MODIFIED="1189966864218" POSITION="left" TEXT="history">
<node COLOR="#000099" CREATED="1189963856671" ID="Freemind_Link_1035596208" LINK="http://en.wikipedia.org/wiki/Design_Patterns" MODIFIED="1189966879703" TEXT="Design Patterns (GOF)">
<edge COLOR="#009999" WIDTH="4"/>
</node>
</node>
<node COLOR="#cc0066" CREATED="1189967722125" ID="Freemind_Link_96934251" MODIFIED="1189983178437" POSITION="left" TEXT="Anti Patern">
<cloud/>
<icon BUILTIN="clanbomber"/>
<node BACKGROUND_COLOR="#000000" COLOR="#ff99ff" CREATED="1189967890937" ID="Freemind_Link_1064699894" MODIFIED="1189969867312" TEXT="a pattern that tells how to go from a problem to a bad solution."/>
<node CREATED="1189968307765" ID="Freemind_Link_588033840" LINK="http://c2.com/cgi/wiki?AntiPatternsCatalog" MODIFIED="1189968319375" TEXT="Catalog"/>
<node CREATED="1189969109250" ID="Freemind_Link_1178532266" LINK="http://c2.com/cgi/wiki?SpaghettiCode" MODIFIED="1325684898456" TEXT="Spaghettiness">
<icon BUILTIN="ksmiletris"/>
<node CREATED="1189969252859" ID="Freemind_Link_256552213" MODIFIED="1189969258265" TEXT="spaghetti code often is all code that is not our own because it was generated by minds that think differently than us.">
<icon BUILTIN="ksmiletris"/>
</node>
</node>
<node CREATED="1189969559531" ID="Freemind_Link_471641436" MODIFIED="1325684898449" TEXT="Organizational ">
<node CREATED="1189969409546" ID="Freemind_Link_731064030" LINK="http://c2.com/cgi/wiki?UntestedButFinished" MODIFIED="1189969451187" TEXT="Untested But Finished">
<icon BUILTIN="clanbomber"/>
</node>
<node CREATED="1189968512640" ID="Freemind_Link_560962771" LINK="http://c2.com/cgi/wiki?GiveMeEstimatesNow" MODIFIED="1325684898453" TEXT="Give Me Estimates Now">
<icon BUILTIN="clanbomber"/>
<node CREATED="1189968748640" ID="Freemind_Link_1111013885" MODIFIED="1189968771687" TEXT="estimate how much time and extra info is need to produce the desired estimate">
<node CREATED="1189968799750" ID="Freemind_Link_509372619" MODIFIED="1189968801937" TEXT="boss doesn&apos;t buy it. Lower accuracy is suggested instead. Funny thing is however inaccurate the estimate is said to be, it turns into a deadline."/>
</node>
</node>
<node CREATED="1189970566859" ID="Freemind_Link_1914565139" LINK="http://c2.com/cgi/wiki?IfItIsWorkingDontChange" MODIFIED="1189970582015" TEXT="If It Is Working Dont Change"/>
</node>
<node CREATED="1189969820437" ID="Freemind_Link_525405039" LINK="http://c2.com/cgi/wiki?DesignForTheSakeOfDesign" MODIFIED="1189969838781" TEXT="Design For The Sake Of Design"/>
<node CREATED="1189971021359" ID="Freemind_Link_834668172" MODIFIED="1325684898447" TEXT="Over Use Of Patterns">
<node CREATED="1189971079812" MODIFIED="1189971079812" TEXT="Developers, having seen the light regarding the usefulness of patterns, try to use them wherever they can, regardless of whether the pattern is appropriate."/>
<node CREATED="1189971079812" MODIFIED="1189971079812" TEXT="The resulting code tends to be full of factories that only ever return a single thing, that thing being a proxy to a delegate that wraps a class that has a method that has the three lines of code you actually want to execute."/>
</node>
</node>
<node CREATED="1189973486859" ID="Freemind_Link_1358871465" MODIFIED="1325684898438" POSITION="right" TEXT="tools">
<edge COLOR="#000099"/>
<node CREATED="1189973491765" ID="Freemind_Link_1960720056" LINK="http://argouml.tigris.org/" MODIFIED="1189973510796" TEXT="argouml"/>
<node CREATED="1189974766359" ID="Freemind_Link_1138071742" MODIFIED="1189974774843" TEXT="eclipse plug-ins">
<node CREATED="1189974777453" ID="Freemind_Link_1261034391" LINK="http://www.patternbox.com/" MODIFIED="1189974798203" TEXT="pattern box">
<node CREATED="1189976435000" ID="Freemind_Link_545174189" MODIFIED="1189976444171" TEXT="includes 16 design patterns of the Gang of Four (GoF)."/>
</node>
<node CREATED="1189974968515" ID="Freemind_Link_1687377141" LINK="http://www.alphaworks.ibm.com/tech/dptk" MODIFIED="1189974989375" TEXT="Design Pattern Toolkit">
<node CREATED="1189976362234" ID="Freemind_Link_1858294437" MODIFIED="1189976391343" TEXT="create patterns and generates applications from patterns"/>
</node>
</node>
</node>
<node CREATED="1189983083828" ID="Freemind_Link_1172489646" MODIFIED="1189983089625" POSITION="right" TEXT="resources">
<node CREATED="1189967431140" HGAP="33" ID="Freemind_Link_1736944605" LINK="http://en.wikipedia.org/wiki/Pattern_theory" MODIFIED="1190063051671" TEXT="http://en.wikipedia.org/wiki/Pattern_theory" VSHIFT="-1">
<edge COLOR="#000099"/>
<font ITALIC="true" NAME="SansSerif" SIZE="12"/>
</node>
<node CREATED="1189983362046" ID="Freemind_Link_541259740" LINK="http://www.go4expert.com/forums/showthread.php?t=5127" MODIFIED="1190063059234" TEXT="go4expert.com &gt; Forums &gt; Showthread ? ..." VSHIFT="8"/>
<node CREATED="1189971726812" HGAP="26" ID="Freemind_Link_1514170888" LINK="http://home.earthlink.net/~huston2/dp/patterns.html" MODIFIED="1190063065468" TEXT="Design Patterns http://home.earthlink.net/~huston2/dp/patterns.html" VSHIFT="11"/>
<node CREATED="1190065549312" ID="Freemind_Link_811955293" LINK="http://www.exciton.cs.rice.edu/JAvaResources/DesignPatterns/" MODIFIED="1190065604734" TEXT="Design Patterns (exciton)"/>
<node CREATED="1189971476109" ID="Freemind_Link_1689239745" LINK="http://home.earthlink.net/~huston2/dp/all_uml.html" MODIFIED="1189982845578" TEXT="Design Class Diagrams">
<edge COLOR="#000099"/>
</node>
</node>
<node CREATED="1189984163250" ID="Freemind_Link_1585293001" LINK="http://en.wikipedia.org/wiki/Design_pattern_%28computer_science%29#Criticism" MODIFIED="1189984217515" POSITION="left" TEXT="Unlike components, does not provide reuse"/>
</node>
</map>
