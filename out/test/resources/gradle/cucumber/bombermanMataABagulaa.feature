Feature: Bomberman suelta una bomba , si la bomba alcanza a bagulaa
adquiero un poder de mejora . Puede lanzar bombas .

Scenario: Bomberman suelta una bomba y alcanza a bagula

Given un Bomberman suelta una bomba para matar a bagulaa que se encuentre al "Norte"
When Cuando suelta la bomba de "3" ticks , se mueve al "sur " y explota la bomba
Then Bagulaa muere

Scenario: bomberman mata a Bagulaa y obtiene poder

  Given Bomberman suelta una bomba para matar a bagulaa que se encuentra al "Norte"
  When se mueve al "Sur" y la bomba explota luego de "3"ticks" y mata a bagulaa
  Then Bomberman obtiene poder

 

