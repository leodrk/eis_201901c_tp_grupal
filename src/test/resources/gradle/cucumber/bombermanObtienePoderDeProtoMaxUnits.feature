Feature: Bomberman puede obtener los poderes de Proto Max Unit tras destruirlo
Como jugador dentro del juego
Quiero poder matar y obtener los poderes del enemigo "Proto Max Unit"
Para poder tener el poder de saltar o lanzar varias bombas a la vez

Scenario: Bomberman obtiene el Poder de lanzar varias bombas a la vez
Given un bomberman que tiene a un enemigo Proto Max Unit en una celda contigua al "Norte"
And Bomberman suelta una bomba
When la bomba alcanza a Proto Max Unit este muere dropeando el poder de lanzar varias bombas a la vez
And bomberman se mueve a la celda del "norte"
Then bomberman puede lanzar mas de una bomba a la vez