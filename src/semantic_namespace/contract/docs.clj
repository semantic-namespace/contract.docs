(ns semantic-namespace.contract.docs
  (:require [clojure.spec.alpha :as s]
            [semantic-namespace.contract.type :as contract.type]))

(s/def :docs/content string?)

(contract.type/def :semantic-namespace/docs [:docs/content])

