I create my first API which talks to the database and sends the response back to the user.

**Request**
`{
    "name": "Ayush",
    "email": "ayush@example.com"
}`

**Response:**

`{
    "id": 3,
    "name": "Ayush",
    "email": "ayush@example.com",
    "createdAt": "2025-12-17T14:57:14.673808600Z"
}`

Status code: 201 Created means that the API responded with updated value and the data has been processed.
