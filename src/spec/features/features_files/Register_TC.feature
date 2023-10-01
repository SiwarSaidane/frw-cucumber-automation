Feature: Verifier le module register
  En tant que utilisateur je souhaite remplir le formulaire afin de m enregistrer

  @moduleRegister
  Scenario Outline: Remplir le formulaire register
    Given Je me connecte a l application Mercury
    When Je clique sur le boutton Register
    And Je saisis un data dans le champs username "<username>"
    And Je saisis un data dans le champs lastname "<lastname>"

    Examples: 
      | username | lastname |
      | Awatef   | Agrbaoui |
      | Siwar    | Saidane  |
