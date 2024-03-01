#!/usr/bin/env bb

;; Okay How do I do this easily 
;; No Its not my first time 


;; Okay how about some help with from gpt

;; It gave us two functions execute-command and a main
;; Together they will slurp all sweet words you type away at the command line
;; Turns it into a sequence that if it is not empty then there is going to be a party

;; Inside the party, also known as a collection, or sequence if you want to get technical
;; at this point were talking about the 'args' found in lines 21, 22, and 23.

;; I skipped line 29. If your that new let me know so I can explain

;; It's a little stange how all those personalities squenze in all at once

;; What line 8 is basically saying is when there are....
;; and atleast one element (personality) is present
;; but if there are 2, 5, or more... Well. Just pretend your missing your home in
;; ancient rome that has an ocean front view
;; and your in Rome on a buisness trip  and to this deal there is a certain ritual 
;; that must occur in or to seal it. It your usual thing or the way you like to conduct your buisness
;; but when in rome.

;; So when in rome and a lot of people, I mean personalities, arguments, oh no none of those.

;; When and at least one argument is present do proceed with that function on line 40, which

;; chooses the first argument you passed in.

;; TODO - This is a work in progress and I don't like arguments. So will need to write documentation

(defn help-p
  []
  (println "I'm still setting up.")
  (println "hello - Renders a Greeting")
  (println "help - Shows you this message"))



;; TODO - this weirs need to fix next time
(defn schedule
  []
  (println "Is it getting weird yet?"))



(defn- execute-command [p]
  (cond
    (= p "hello") (println "Glad to see you, come on in. If you need anything just call for help") ;  
    (= p "help") (println (help-p)) ; 
    (= p "schedule") (schedule) ; 
    :else (println "Hello anyone there. Oh come out and say hello.")))


;; DONE   to call args what they are called in the programming world -> arguments. We also say parameters
;;        Actually we can use conditions. This stuff just doesn't roll of the tounge. I need substance.
;;        Okay how about this we can write in. Oh that's right. I forgot.



(defn -main [personalities]
    (let [p (first personalities)] ; I'm not sure how I did this. Yeah I have been changing stuff the machine gives me.
      (execute-command p)))


(-main *command-line-args*)

;; Well that wasn't bad for a first date. So what we did was ask gpt

;; `I need a simple cli interpretor with clojure`

;; and after a minute or two `instead of reading from stdin make it accept args from the command line`

;; Then we moved stuff around. You know, to make it look good, give it style, and rhythem.

;; Okay so lets schedule another 2 hours for tomorrow.