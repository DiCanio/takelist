(defproject takelist "0.1-SNAPSHOT"
  :description "An application which manages things like coffee or drinks which are available in a shared space at work."
  :url "https://github.com/alexanderkiel/takelist"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies
  [
   ;; Webserver
   [aleph "0.4.2-alpha12"]

   ;; Routing
   [bidi "2.0.16"]

   ;; JSON Web Token
   [buddy/buddy-sign "1.3.0"]

   ;; time lib
   [clj-time "0.13.0"]

   ;; Umgebungsvariablen
   [environ "1.1.0"]

   ;; HTML Output
   [hiccup "1.0.5"]

   ;; Clojure itself
   [org.clojure/clojure "1.9.0-alpha14"]

   ;; Database driver
   [org.clojure/java.jdbc "0.6.1"]

   ;; Web middleware and handler specification
   [ring/ring-core "1.5.0"]]

  :profiles {:dev
             {:source-paths ["dev"]
              :dependencies [
                             ;; In-Memory Database System
                             [com.h2database/h2 "1.4.192"]

                             [org.clojure/tools.namespace "0.2.11"]

                             [org.clojure/test.check "0.9.0"]]}

             :production
             {:main takelist.core}})
