Feature: Je verifie la page d authentification
  En tant q utilisateur je souhaite me connecter a l application Mercury
  @connexion
  Scenario: Je verifie la page d authentification
    Given Je me connecte a l application Mercury
    When Je saisis le username "test"
    And Je saisis le password "test"
    And Je clique sur le boutton submit
    Then Je me redirige vers la page home "Login Successfully"   