
@tag
Feature: Verifier le module register
  En tant que utilisateur je souhaite remplir le formulaire afin de m enregistrer

  

  @tag2
  Scenario Outline: Remplir le formulaire register
    Given Je me connecte a l application Mercury
    When Je clique sur le boutton Register
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
