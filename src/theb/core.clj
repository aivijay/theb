(ns theb.core
  (:gen-class)
  (:require
   [clojure.edn :as edn]
   [clojure.tools.logging :as log]
   [clj-pid.core :as pid]
   [io.aviso.logging :as pretty]
   [clojure.tools.namespace.repl :refer [refresh]]
   [matthiasn.systems-toolbox.switchboard :as sb]
   [matthiasn.systems-toolbox.scheduler :as sched]
   [matthiasn.systems-toolbox-sente.server :as sente]
   [matthiasn.systems-toolbox-metrics.metrics :as metrics]))

(pretty/install-pretty-logging)
(pretty/install-uncaught-exception-handler)

(def conf (edn/read-string (slurp "conf/config.edn")))

(defn -main
  "Starts the application from command line. Also saves and logs process ID. The system that is fired up when
  start! is called proceeds in core.async's thread pool. Since we don't want the application to exit when
  just because the current thread is out of work, we just put it to sleep."
  [& args]
  (pid/save (:pidfile-name conf))
  (pid/delete-on-shutdown! (:pidfile-name conf))
  (log/info "Application started, PID" (pid/current))
  (Thread/sleep Long/MAX_VALUE))
