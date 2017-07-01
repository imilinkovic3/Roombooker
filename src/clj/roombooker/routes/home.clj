(ns roombooker.routes.home
  (:require [roombooker.layout :as layout]
            [compojure.core :refer [defroutes GET POST]]
            [ring.util.http-response :as response]
            [roombooker.db.core :as db]))



(defn home-page []
(println (db/get-all-reservations))
  (layout/render
    "home.html" {:reservations (db/get-all-reservations)}))

 (defn save-reservation! [request]
                           (db/save-reservation! (:params request) )
                           (response/found "/"))

 (defn delete-reservation! [request]
                           (db/delete-reservation! (:params request) )
                           (response/found "/"))

 (defn update-reservation! [request]
                           (db/update-reservation! (:params request) )
                           (response/found "/"))

(defn allreservations-page []
(println (db/get-all-reservations))
  (layout/render
    "allreservations.html" {:reservations (db/get-all-reservations)}))

(defn about-page []
  (layout/render "about.html"))

  (defn addReservation-page []
    (layout/render "addReservation.html"))

(defroutes home-routes
  (GET "/" [] (home-page))
  (POST "/reservation" request (save-reservation! request))
  (GET "/about" [] (about-page))
  (GET "/addreservation" [] (addReservation-page))
  (POST "/deletereservation" request (delete-reservation! request))
  (POST "/updatereservation" request (update-reservation! request))
  (GET "/allreservations" [] (allreservations-page)))







