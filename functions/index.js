const functions = require('firebase-functions');
const admin = require('firebase-admin');
admin.initializeApp();

// // Create and Deploy Your First Cloud Functions
// // https://firebase.google.com/docs/functions/write-firebase-functions
//
// exports.helloWorld = functions.https.onRequest((request, response) => {
//  response.send("Hello from Firebase!");
// });
exports.respuesta = functions.database.ref('/pedido/{pedidoId}').onCreate((snap, context) => {
  const createdData = snap.val(); // data that was created
//  var platosPedidos=snap.child("platos").val();
  const idPedido=context.params.id;
  const nombre=context.auth.token.name;
  var topic="rotiseria";

  console.log(context.params.id);
  console.log(""+idPedido);
//  console.log(context.auth.token.name);
//  console.log(context.auth.token.email);
//  console.log(context.auth.token.picture);


/*
var payload = {
                  data: {
                      idPedido: idPedido,
                      remitente: nombre
                  },
                  topic: topic
              };*/
              var payload = {
                                data: {
                                    idPedido: "pedido 1",
                                    remitente: "soy yo"
                                },
                                topic: topic
                            };

              admin.messaging().send(payload)
                .then((response) => {
                  // Response is a message ID string.
                  console.log('Successfully sent message:', response);
                })
                .catch((error) => {
                  console.log('Error sending message:', error);
                });

                return null;


              });
