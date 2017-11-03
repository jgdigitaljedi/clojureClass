(ns chap2)

(def x "Hello World") ; x contains value on namespace

(let [x "Joey"]
  (print "hello, " x)) ; x only exists in wrapped ()

(print x) ; would print global "Hello World"

(if (empty? x)
  "X is empty"
  "X is not empty") ; X is not empty

(if (empty? x)
  nil
  (do
    (println "ok")
    :ok)) ; would print line ok and return ok
; in the functional programming paradigm, avoid using 'do' as it creates side effects

(if-not (empty? x)
  (do
    (println "ok")
    :ok)) ; would print line ok and return ok

(when-not (empty? x)
  (println "ok")
  :ok) ; wraps if in a do basically...would print ok and return ok like above

(when (not (empty? x)) :ok) ; returns ok

(case x
  "Goodbye" :goodbye
  "Hello World" :hello
  :nothing) ; would return hello since x is Hello World

(cond
  (= x "Goodbye") :goodbye
  (= (apply str (reverse x)) "dlroW olleH") :hello
  :otherwise :nothing) ; would return hello, note that reverse return list of character instead of string