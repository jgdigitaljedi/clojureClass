(ns learnclojure)

(print "Hello World")

(+ 1 1) ;2
(- 2 1) ;1
(* 2 4) ;8
(/ 4 2) ;2
(* 3 (- 2 1)) ;3
(type 1) ;long
(type 1.1) ;double
(type true) ;boolean
(type "Hello") ;string
(type :a) ;keyword
(type 'a) ;symbol
(type '(1 2 3)) ;persistenList
(type (list 1 2 3)) ; persistenList
(type (vector 1 2 3)) ;persistent vector
(type [1 2 3]) ;persistentVector
(nth (vector 1 2 3) 2) ;3
(first '(1 2 3)) ;1
{:a 1 :b 2 :c 3} ; hash-map
(:a {:a 1 :b 2}) ;1
(type #{1 2 3 4}) ;persistenHashSet
(type (hash-set 1 2 3 4)) ;persistenHashSet