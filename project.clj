(defproject star-tracker "0.1.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
    [org.clojure/clojure "1.6.0"]
    [org.clojure/core.memoize "0.5.6"]
    [org.clojure/core.async "0.1.346.0-17112a-alpha"]
    [com.stuartsierra/component "0.2.2"]
    [compojure "1.3.1"]
    [ring "1.3.2"]
    [http-kit "2.1.16"]
    [com.taoensso/timbre "3.3.1-1cd4b70"]
    [cheshire "5.4.0"]
    [midje "1.7.0-SNAPSHOT"]
    [clj-kafka/clj-kafka "0.2.8-0.8.1.1"]
    ]
  :java-agents [[com.newrelic.agent.java/newrelic-agent "2.19.0"]]
  :main star-tracker.core
  :uberjar-name "star-tracker.jar"
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
      :dev {:plugins [[lein-midje "3.1.3"]]}
    })
