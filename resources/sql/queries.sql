-- name: save-reservation!
-- creates a new reservation
INSERT INTO reservation
( employeeName, roomName, meetingName, start, end)
VALUES (:employeeName, :roomName, :meetingName, :start, :end)

-- name: update-reservation!
-- update an existing reservation
UPDATE reservation
SET employeeName = :employeeName, roomName = :roomName, meetingName = :meetingName, start = :start, end = :end
WHERE id = :id

-- name: get-one-reservation
-- retrieve a reservation given the id.
SELECT * FROM reservation
WHERE id = :id

-- name: get-all-reservations
-- retrieve all reservations
SELECT * FROM reservation

-- name: delete-reservation!
-- delete a reservation given the id
DELETE FROM reservation
WHERE id = :id



