(ns fun)

(fn [] "Hello") ; returns function

((fn [] "Hello")) ; function that is called and returns Hello

(def hello (fn [] "Hello")) ; gives function callable name
(hello) ; calls hello function and would return Hello

(defn hola [name] (str "Hello, " name)) ; function that takes name arg and return Hello, <name>
(hola "Joey") ; invocation of hola function return Hello, Joey

(defn stuff "Greets a person named <name> with their <title>" [name title] (str "Hello, " title " " name)) ; function with docstring
(stuff "Joey" "Mr.") ; calls above function passing 2 params; can use commas to separate if want to
(require '[clojure.repl :refer [doc]]) ; importing doc module
(doc stuff) ; returns doc line of function (Greets a person named <name> with their <title>)

(defn multargs [& args]
  (str "Hello, " (apply str args))) ; function that takes multiple args and returns concatted as string
(multargs "Joey" "Solis" "Brandy") ; calls function and returns "Hello, JoeySolisBrandy"

(defn optargs
  ([] "Hello Wolrd")
  ([name] (str "Hello, " name))) ; function with different return depending on # of args received
(optargs) ; returns Hello World
(optargs "Joey") ; returns Hello, Joey

(defn optargsrecursive
  ([] (optargsrecursive "World"))
  ([name] (str "Hello, " name))) ; function with different return depending on # of args received and recursive call for no args
(optargsrecursive) ; returns Hello, World
(optargsrecursive "Joey") ; returns Hello, Joey

(defn takeconfig [config]
  (str "Hello, " (:name config))) ; function that takes map
(takeconfig {:name "Joey"}) ; calls function, passes map, gets Hello, Joey as return

(defn custconfig [{name :name}] ; decunstructs map
  (str "Hello, " name)) ; function that decunstructs map and assigns param to internal reference
(custconfig {:name "Joey"}) ; calls function and gets back Hello, Joey

(defn custconfig [[name title]] ; decunstructs list and assigns internal reference to each in list
  (str "Hello, " title " " name)) ; 
(custconfig ["Joey" "Mr."]) ; calls function and gets back Hello, Mr. Joey