INSERT INTO USUARIO(NOME,EMAIL,TELEFONE)VALUES('Joaquim da silva', 'a@b.com.br','2710-8289');  
INSERT INTO USUARIO(NOME,EMAIL,TELEFONE)VALUES('bruno alencar', 'bruno@b.com.br','2710-0000');  


INSERT INTO EVENTO(DESCRICAO, DATA, TITULO, ORGANIZADOR_ID)VALUES('Festa do Macarrao na mocca','2019-05-05 18:00:00', 'FESTA DE SAN GENARO',1); 

UPDATE  USUARIO SET EVENTO_ID = 1  WHERE ID = 1; 
UPDATE  USUARIO SET EVENTO_ID = 1  WHERE ID = 2;

INSERT INTO NOTIFICACAO (DATAENVIO,TIPO) VALUES ('2019-05-05 18:00:00','SMS') ;
INSERT INTO NOTIFICACAO (DATAENVIO,TIPO) VALUES ('2019-05-05 19:00:00','email') ;

UPDATE  NOTIFICACAO SET EVENTONOTIFICACAO_ID  = 1  WHERE ID = 1;
UPDATE  NOTIFICACAO SET EVENTONOTIFICACAO_ID  = 1  WHERE ID = 2;


INSERT INTO EVENTO(DESCRICAO, DATA, TITULO, ORGANIZADOR_ID)VALUES('Festa no bairro da liberdade','2019-02-05 12:00:00', 'Ano novo Chines',2); 

UPDATE  USUARIO SET EVENTO_ID = 2  WHERE ID = 1; 
UPDATE  USUARIO SET EVENTO_ID = 2  WHERE ID = 2;

INSERT INTO NOTIFICACAO (DATAENVIO,TIPO) VALUES ('2019-05-05 18:00:00','SMS') ;
INSERT INTO NOTIFICACAO (DATAENVIO,TIPO) VALUES ('2019-05-05 19:00:00','email') ;

UPDATE  NOTIFICACAO SET EVENTONOTIFICACAO_ID  = 2  WHERE ID = 3;
UPDATE  NOTIFICACAO SET EVENTONOTIFICACAO_ID  = 2  WHERE ID = 4;
