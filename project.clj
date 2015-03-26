(defproject hello-world-service "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [io.pedestal/pedestal.service "0.4.0-SNAPSHOT" #_"0.3.1"]
                 [ch.qos.logback/logback-classic "1.1.2" :exclusions [org.slf4j/slf4j-api]]
                 [org.slf4j/jul-to-slf4j "1.7.7"]
                 [org.slf4j/jcl-over-slf4j "1.7.7"]
                 [org.slf4j/log4j-over-slf4j "1.7.7"]]
  :pom-plugins
  [[org.apache.maven.plugins/maven-enforcer-plugin "1.2"
    {:executions
     [:execution
      [:id enforce]
      [:phase verify]
      [:goals [:goal enforce]]
      [:configuration
       [:rules
        [:digestRule {:implementation "uk.co.froot.maven.enforcer.DigestRule"}
         [:buildSnapshot true]
         [:urns
          [:urn "ch.qos.logback:logback-classic:1.1.2:jar:null:compile:b316e9737eea25e9ddd6d88eaeee76878045c6b2"]
          [:urn "ch.qos.logback:logback-core:1.1.2:jar:null:compile:2d23694879c2c12f125dac5076bdfd5d771cc4cb"]
          [:urn "cheshire:cheshire:5.3.1:jar:null:compile:f2ef0fa71d0b36707138609890013ae4a3bcce37"]
          [:urn "clj-time:clj-time:0.6.0:jar:null:compile:a922fbc265cf1e8fc01f811b6f7e106f85172cc3"]
          [:urn "clojure-complete:clojure-complete:0.2.3:jar:null:test:5adba97d7f7736f49fb2b2eed5c8f77e7fe6c40c"]
          [:urn "com.cognitect:transit-clj:0.8.255:jar:null:compile:fba56aa6ac75ecf6cb5d14f8fc9fc7efd1d49365"]
          [:urn "com.cognitect:transit-java:0.8.266:jar:null:compile:9fe7f72022a2912c269b42adfdeaee94174ff512"]
          [:urn "com.fasterxml.jackson.core:jackson-annotations:2.3.0:jar:null:compile:f5e853a20b60758922453d56f9ae1e64af5cb3da"]
          [:urn "com.fasterxml.jackson.core:jackson-core:2.3.2:jar:null:compile:559b70ac8a0d5cad611da4223137a920147201ba"]
          [:urn "com.fasterxml.jackson.core:jackson-databind:2.3.2:jar:null:compile:c75edc740a6d8cb1cef6fa82fa594e0bce561916"]
          [:urn "com.fasterxml.jackson.dataformat:jackson-dataformat-smile:2.3.1:jar:null:compile:a39db9e485fe401e2a7a47b04cf4694702272eeb"]
          [:urn "com.fasterxml.jackson.datatype:jackson-datatype-json-org:2.3.2:jar:null:compile:95d8e4a74af91b702eae27d175c88904113e8a2d"]
          [:urn "com.googlecode.json-simple:json-simple:1.1.1:jar:null:compile:c9ad4a0850ab676c5c64461a05ca524cdfff59f1"]
          [:urn "commons-codec:commons-codec:1.9:jar:null:compile:9ce04e34240f674bc72680f8b843b1457383161a"]
          [:urn "commons-fileupload:commons-fileupload:1.3:jar:null:compile:c89e540e4a12cb034fb973e12135839b5de9a87e"]
          [:urn "commons-io:commons-io:2.4:jar:null:compile:b1b6ea3b7e4aa4f492509a4952029cd8e48019ad"]
          [:urn "crypto-equality:crypto-equality:1.0.0:jar:null:compile:6728b7a444008fe576167fcadb92fea23bb17d42"]
          [:urn "crypto-random:crypto-random:1.2.0:jar:null:compile:cd5ed1fa18919cc13f5ab5feabdff21cc4b0faf6"]
          [:urn "io.pedestal:pedestal.jetty:0.3.1:jar:null:test:b8a7ae23b5fb47cb56d5533c627f172065b952b9"]
          [:urn "io.pedestal:pedestal.service-tools:0.3.1:jar:null:test:8b9c0613edf909ecb4f962e86c9259185c1f05a0"]
          [:urn "javax.servlet:javax.servlet-api:3.1.0:jar:null:test:3cd63d075497751784b2fa84be59432f4905bf7c"]
          [:urn "joda-time:joda-time:2.2:jar:null:compile:a5f29a7acaddea3f4af307e8cf2d0cc82645fd7d"]
          [:urn "ns-tracker:ns-tracker:0.2.1:jar:null:test:625c2bc29d562cd5a1af66ccf1b5fb336bb48a8a"]
          [:urn "org.apache.directory.studio:org.apache.commons.codec:1.8:jar:null:compile:af243a2c8302b659b0afe9b4a2d8add1b7f964c0"]
          [:urn "org.apache.maven.plugins:maven-clean-plugin:2.5:maven-plugin:null:runtime:75653decaefa85ca8114ff3a4f869bb2ee6d605d"]
          [:urn "org.apache.maven.plugins:maven-compiler-plugin:3.1:maven-plugin:null:runtime:9977a8d04e75609cf01badc4eb6a9c7198c4c5ea"]
          [:urn "org.apache.maven.plugins:maven-deploy-plugin:2.7:maven-plugin:null:runtime:6dadfb75679ca010b41286794f737088ebfe12fd"]
          [:urn "org.apache.maven.plugins:maven-enforcer-plugin:1.2:maven-plugin:null:runtime:6b755a9a0d618f8f57c0b5c4a0737a012e710a46"]
          [:urn "org.apache.maven.plugins:maven-install-plugin:2.4:maven-plugin:null:runtime:9d1316166fe4c313f56276935e08df11f45267c2"]
          [:urn "org.apache.maven.plugins:maven-jar-plugin:2.4:maven-plugin:null:runtime:e3200bcf357b5c5e26df072d27df160546bb079a"]
          [:urn "org.apache.maven.plugins:maven-resources-plugin:2.6:maven-plugin:null:runtime:dd093ff6a4b680eae7ae83b5ab04310249fc6590"]
          [:urn "org.apache.maven.plugins:maven-site-plugin:3.3:maven-plugin:null:runtime:77ba1752b1ac4c4339d6f11554800960a56a4ae1"]
          [:urn "org.apache.maven.plugins:maven-surefire-plugin:2.12.4:maven-plugin:null:runtime:2b435f7f77777d2e62354fdc690da3f1dc47a26b"]
          [:urn "org.clojure:clojure:1.6.0:jar:null:compile:1d95fb21562fa9d6df138a568ba5cab3e1dd3c98"]
          [:urn "org.clojure:core.async:0.1.346.0-17112a-alpha:jar:null:compile:8c111443964a8740121d752dcb00d293f30bad8d"]
          [:urn "org.clojure:core.cache:0.6.3:jar:null:compile:4cec9a62b7872495aacabad1e9d0085361ba8130"]
          [:urn "org.clojure:core.incubator:0.1.3:jar:null:compile:3cd0ac17ff0c27a7845ded943ccf6edb1610aef0"]
          [:urn "org.clojure:core.match:0.3.0-alpha3:jar:null:compile:b5f8ee1832f805ac91598029ed12ba415acaa66d"]
          [:urn "org.clojure:core.memoize:0.5.6:jar:null:compile:36b5ffd86783dade13d4af667147c32ea0ecfee4"]
          [:urn "org.clojure:data.priority-map:0.0.2:jar:null:compile:f13311d5a510cdaaa230add17b373c9e50395d3e"]
          [:urn "org.clojure:java.classpath:0.2.0:jar:null:test:97323796c0f397e2110e687b1ec75d21b1413d05"]
          [:urn "org.clojure:test.check:0.5.9:jar:null:compile:4dc3da4d10f0fb01a9c36eed3d4f8a23d75321fc"]
          [:urn "org.clojure:tools.analyzer.jvm:0.6.5:jar:null:compile:7bdb6517b283f2f8d7ec5b88a387c9d34f4b5586"]
          [:urn "org.clojure:tools.analyzer:0.6.4:jar:null:compile:429cb1a0449fe781dd812c038cbd6e557ed404a9"]
          [:urn "org.clojure:tools.namespace:0.1.3:jar:null:test:4de0e0cade23b85c340a4c7bc11d2e4dd890e429"]
          [:urn "org.clojure:tools.nrepl:0.2.6:jar:null:test:4714f0f5e38a190249cc8af4858958ffaab6c31e"]
          [:urn "org.clojure:tools.reader:0.8.12:jar:null:compile:4294a2c0ceac87330c0577b5f6c4992f0558b808"]
          [:urn "org.eclipse.jetty:jetty-http:9.2.0.v20140526:jar:null:test:64888c16e238487104c626eea38df65753458622"]
          [:urn "org.eclipse.jetty:jetty-io:9.2.0.v20140526:jar:null:test:4fdedcadec39beb30a51adfb66bfeb07e893a43d"]
          [:urn "org.eclipse.jetty:jetty-security:9.2.0.v20140526:jar:null:test:6d3622649490858bf3ec3351183476132d403b5c"]
          [:urn "org.eclipse.jetty:jetty-server:9.2.0.v20140526:jar:null:test:9ec677f5b4acc6e0e89fa5b40aab8a80dddbf9fe"]
          [:urn "org.eclipse.jetty:jetty-servlet:9.2.0.v20140526:jar:null:test:91ee7074d589ec54c10ec3dfcbd5f3cfd66208b7"]
          [:urn "org.eclipse.jetty:jetty-util:9.2.0.v20140526:jar:null:test:5c01ab2eeb7eefe22bacb41d61025d16a66c7697"]
          [:urn "org.javassist:javassist:3.18.1-GA:jar:null:compile:d9a09f7732226af26bf99f19e2cffe0ae219db5b"]
          [:urn "org.json:json:20090211:jar:null:compile:c183aa3a2a6250293808bba12262c8920ce5a51c"]
          [:urn "org.msgpack:msgpack:0.6.10:jar:null:compile:190abcbd597f4774d7bf7eb1f550ac184acbb52f"]
          [:urn "org.ow2.asm:asm-all:4.2:jar:null:compile:7f7277e5b8002226ebfc8b861c775da8f6a55afd"]
          [:urn "org.slf4j:jcl-over-slf4j:1.7.7:jar:null:compile:56003dcd0a31deea6391b9e2ef2f2dc90b205a92"]
          [:urn "org.slf4j:jul-to-slf4j:1.7.7:jar:null:compile:def21bc1a6e648ee40b41a84f1db443132913105"]
          [:urn "org.slf4j:log4j-over-slf4j:1.7.7:jar:null:compile:d521cb26a9c4407caafcec302e7804b048b07cea"]
          [:urn "org.slf4j:slf4j-api:1.7.7:jar:null:compile:2b8019b6249bb05d81d3a3094e468753e2b21311"]
          [:urn "ring:ring-codec:1.0.0:jar:null:compile:e2e0be35ee22202a6da3769b606c485e4154f6e9"]
          [:urn "ring:ring-core:1.3.2:jar:null:compile:125f8c05b4768d16e5da46dc8fb62b0e77e1289d"]
;;;          [:urn "tigris:tigris:0.1.1:jar:null:compile:0187674e86c2e94eefb4f80c13a6b10345dd6ad2"]
          [:urn "uk.co.froot.maven.enforcer:digest-enforcer-rules:0.0.1:jar:null:runtime:16a9e04f3fe4bb143c42782d07d5faf65b32106f"]]]]]]
     :dependencies
     [:dependency
      [:groupId uk.co.froot.maven.enforcer]
      [:artifactId digest-enforcer-rules]
      [:version "0.0.1"]]}]]
  :min-lein-version "2.0.0"
  :resource-paths ["config", "resources"]
  :profiles {:dev {:aliases {"run-dev" ["trampoline" "run" "-m" "hello-world-service.server/run-dev"]
                             "jetty-runner" ["trampoline" "with-profile" "jetty-runner" "run"]} ; eg: lein jetty-runner target/hello-world.war
                   :dependencies [[io.pedestal/pedestal.service-tools "0.3.1"]
                                  [org.clojure/tools.namespace "0.2.6"] ;; Has to be specified otherwise excluding lein plugins will cause 0.1.3 to be picked by service-tools
                                  [io.pedestal/pedestal.jetty "0.3.1"]]}
             :jetty-runner {:dependencies ^:replace [[org.clojure/clojure "1.6.0"] ; Not sure why this needs to be here for just running a pure java jar? Get complaints if missing.
                                                     [org.eclipse.jetty/jetty-runner "9.2.10.v20150310" :exclusions [org.glassfish/javax.el]] ; version range used on javax.el
                                                     [org.glassfish/javax.el "3.0.0" :scope "test"]]
                            :main org.eclipse.jetty.runner.Runner}}
  :main ^{:skip-aot true} hello-world-service.server
  :plugins [[ohpauleez/lein-pedestal "0.1.0-beta10"]
            [pandect "0.5.1"]
            [lein-lock "0.1.0-SNAPSHOT"]]
  :pedestal {:server-ns hello-world-service.server
             :url-pattern "/*"})
