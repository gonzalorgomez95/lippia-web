Feature: As a potential client i need to search in google to find a web site

  @Smoke @Automated @SearchCrowdar @Ignore
  Scenario: The client search by "crowdar"
    Given The client is on google page
    When The client search for word crowdar
    Then The client verify that results are shown properly

  @Smoke @Automated @SearchAutomation @Ignore
  Scenario: The client search by "Automation"
    Given The client is on google page
    When The client search for word Automation
    Then The client verify that results are shown properly

  @Smoke @Automated @SearchDocker @Ignore
  Scenario: The client search by "Docker"
    Given The client is on google page
    When The client search for word Docker
    Then The client verify that results are shown properly

  @Smoke @Automated @SearchLippia @Ignore
  Scenario: The client search by "Lippia"
    Given The client is on google page
    When The client search for word Lippia
    Then The client verify that results are shown properly

  @Smoke @Automated
  Scenario Outline: Google Search - The client search by <word>.
    Given The client is on google page
    When The client search for word <word>
    Then The client verify that results are shown properly

    @SearchCrowdarAcademy
    Examples:
      | word            |
      | Crowdar Academy |

    @SearchCalidad
    Examples:
      | word    |
      | Calidad |

    @SearchSoftware
    Examples:
      | word     |
      | Software |

    @SearchTesting
    Examples:
      | word    |
      | Testing |
