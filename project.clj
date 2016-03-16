(defproject theb "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [expectations "2.0.9"]
                 [org.clojure/tools.reader "1.0.0-alpha2"]
                 [org.clojure/clojurescript "1.7.228"]
                 [clojurewerkz/elastisch "2.2.1"]
                 [com.rpl/specter "0.9.2"]
                 [org.clojure/tools.logging "0.3.1"]
                 [com.taoensso/timbre "4.3.1" :exclusions [io.aviso/pretty]]
                 [com.taoensso/encore "2.42.0"]
                 [com.taoensso/carmine "2.12.2"]
                 [matthiasn/systems-toolbox "0.5.14"]
                 [matthiasn/systems-toolbox-sente "0.5.12"]
                 [matthiasn/systems-toolbox-ui "0.5.5"]
                 [matthiasn/systems-toolbox-metrics "0.5.2"]
                 [org.clojure/tools.namespace "0.2.11"]
                 [ch.qos.logback/logback-classic "1.1.6"]
                 [hiccup "1.0.5"]
                 [garden "1.2.5"]
                 [clj-time "0.11.0"]
                 [pandect "0.5.4"]
                 [amalloy/ring-gzip-middleware "0.1.3"]
                 [tailrecursion/cljs-priority-map "1.1.0"]
                 [org.clojure/data.priority-map "0.0.7"]
                 [reagent "0.5.1"]
                 [cljsjs/moment "2.10.6-3"]
                 [clj-pid "0.1.2"]
                 [ring/ring-ssl "0.2.1" :exclusions [ring/ring-core]]
                 [metrics-clojure "2.6.1"]
                 [incanter "1.5.7"]
                 [incanter/incanter-core "1.5.7"]
                 [incanter/incanter-io "1.5.7"]
                 [incanter/incanter-charts "1.5.7"]
                 [incanter/incanter-processing "1.3.0"]]
  :plugins [[lein-expectations "0.0.8"]]
  :main ^:skip-aot theb.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
