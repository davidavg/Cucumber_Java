Feature: Table
  This feature is an sample of how to use tables on cucumber

  Scenario:  Table test
    Given I want to test tables
    When I run the test
    Then I want to print outputs
    | 01 | test 								 	|
    | 02 | this is a second test 	| 
    | 03 | new 										| 
    | 99 | last test						 	| 

	Scenario:  Table test with headers
    Given I want to test tables
    When I run the test
    Then I want to print tableHeaders
    | ID |    Text								|
    | 01 | test 								 	|
    | 02 | this is a second test 	| 
    | 03 | new 										| 
    | 99 | last test						 	| 
    
    
	Scenario Outline:  Table test with outliners
    Given I want to test outline
    When I run the test
    Then I want to print <ID> and <Text>
    
	Examples:
    | ID |    Text								|
    | 01 | test 								 	|
    | 02 | this is a second test 	| 
    | 03 | new 										| 
    | 99 | last test						 	|
    
    
    