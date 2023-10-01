Feature: Je verifie la page Register
  En tant q utilisateur je souhaite m enregistrer dans l application Mercury
  
  @Register
  Scenario: Je verifie la page Register
    Given Je me connecte a l application Mercury
    And Je me connecte a la page Register
    When Je saisis le First Name "SiwarS"
    And Je saisis le Last Name "test"
    And Je saisis le Phone "53821049"
    And Je saisis le Email "siwarsaidane@gmail.com"
    And Je saisis le Email "siwarsaidane@gmail.com"
    And Je saisis l Adress "10 adress"
    And Je saisis City "Tunis"
    And Je saisis State "Tunis"
    And Je saisis Postal Code "2023"
    And Je saisis Country "TUNISIA"
    And Je saisis City "Tunis"
    And Je saisis User Name "SiwarS"
    And Je saisis Password "SiwarS"
    And Je saisis Confirm Password "test"
    And Je clique sur le boutton Envoyer
    Then Je suis enregistre dans l application 
    