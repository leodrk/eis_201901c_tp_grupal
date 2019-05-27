Feature: Bomberman puede destruir a Bagulaa y obtener el poder de lanzar bombas
 Como jugador dentro del juego
 Quiero poder destruir a Bagulaa
 Para obtener el poder de Lanzar Bombas

Scenario: Bomberman suelta bomba y esta alcanza a Bagulaa
 Given un bomberman que tiene a un enemigo Bagulaa en una celda contigua al "Norte"
 When bomberman suelta una bomba que destruye a Bagulaa
 Then bomberman se mueve a la celda del norte y obtiene el poder de Lanzar Bombas