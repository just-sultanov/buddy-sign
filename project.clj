(defproject buddy/buddy-sign "0.7.0-SNAPSHOT"
  :description "High level message signing for Clojure"
  :url "https://github.com/funcool/buddy-sign"
  :license {:name "Apache 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.7.0" :scope "provided"]
                 [com.taoensso/nippy "2.9.0"]
                 [buddy/buddy-core "0.6.0"]
                 [funcool/cats "0.6.1"]
                 [clj-time "0.10.0"]
                 [cheshire "5.5.0"]]
  :source-paths ["src"]
  :javac-options ["-target" "1.7" "-source" "1.7" "-Xlint:-options"]
  :test-paths ["test"]
  :plugins [[lein-ancient "0.6.7"]])
