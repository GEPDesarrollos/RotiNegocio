    const functions = require('firebase-functions');
    const admin = require('firebase-admin');
    admin.initializeApp();

    exports.respuesta = functions.database.ref('/pedido/{pedidoId}').onCreate((snap, context) => {

      const createdData = snap.val(); // data that was created
      const nombre = context.auth.token.name || null;
      const idPedido = context.params.pedidoId;//.pedidoId;|se pone el nombre del ref {pedidoId}
      const topic="rotiseria";

      console.log(context.params.pedidoId);
      console.log(createdData);
      console.log(context);

      var payload = {
                        data: {
                                idPedido: ""+idPedido,
                                remitente: ""+nombre
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