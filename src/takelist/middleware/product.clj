(ns takelist.middleware.product)

(defn wrap-product [handler]
    (fn [request]
      (handler (merge request {:product {:id "abc123" :name "Dummy-Product"}}))
    )
)
