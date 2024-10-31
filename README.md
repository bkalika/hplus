Examples: 
POST http://localhost:8080/graphql

query {
orders {
id
customer {
id
firstName
lastName
email
}
salesperson {
id
firstName
lastName
email
}
orderLines {
product {
name
variety
size
price
}
quantity
}
}
}
--------------
query {
customerById(id: 2) {
id
firstName
lastName
email
address
}
}
-------------------
mutation {
addProduct(
input: {
id: "MWMAN99"
name: "Mineral Water"
size: 99
price: 1.99
variety: "Blueberry"
status: "DISCONTINUED"
}
) {
id
name
size
price
variety
status
}
}
