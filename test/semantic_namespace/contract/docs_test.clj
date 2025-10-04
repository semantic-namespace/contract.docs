(ns semantic-namespace.contract.docs-test
  (:require [clojure.test :refer (deftest testing is)]
            [semantic-namespace.contract :as contract]
            [semantic-namespace.contract.docs]))
  
(deftest docs-test
  (testing "define and retrieve docs"
    (let [content "wow, here my docs"]
      (contract/def
        :semantic-namespace/docs
        :external.service/foo
        {:docs/content content})
      (is (= content (:docs/content (contract/fetch :semantic-namespace/docs :external.service/foo)))))))


