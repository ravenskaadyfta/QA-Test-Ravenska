import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'gitHub.goToUrl'()

CustomKeywords.'gitHub.loginGitHub'()

WebUI.delay(1)

WebUI.click(findTestObject('summary_Sign out_Header-link'))

WebUI.click(findTestObject('a_New gist'))

WebUI.delay(1)

WebUI.setText(findTestObject('fieldDesc'), 'Create a gist test automation')

WebUI.delay(1)

WebUI.setText(findTestObject('fieldFileName'), 'qa-gist.md')

WebUI.delay(1)

WebUI.setText(findTestObject('fieldInputGit'), '# Gist QA scenarios\n\n## Preparation\n\nBefore starting, you will need:\n\n- Testing framework of your choice.\n- Git.\n- 2 hours of your time.\n\n## The Exercise\n\nFor this exercise, you will be creating a end-to-end (e2e) tests for creating a gist.\n\n### User Stories\n\n- As a user, I want to create a public gist.\n- As a user, I want to edit an existing gist.\n- As a user, I want to delete an existing gist.\n- As a user, I want to see my list of gists.\n\n#### Notes\n\n- User credentials should be configurable, do not include your credentials in the submission.\n\n## Evaluation Checklist\n\n* Code quality & readability: Will an average engineer be able to understand the tests just by briefly scanning through the source code?\n* Case coverage: Does the test cover all possible user scenarios?')

WebUI.scrollToElement(findTestObject('scroll'), 0)

WebUI.click(findTestObject('buttonCreateGist'))

WebUI.click(findTestObject('clickAva'))

WebUI.click(findTestObject('a_Your gists'))

WebUI.click(findTestObject('selectExistingGist'))

WebUI.click(findTestObject('a_Edit'))

WebUI.setText(findTestObject('fieldInputGit'), 'User Edit Gist')

WebUI.click(findTestObject('buttonUpdate'))

WebUI.click(findTestObject('clickAva'))

WebUI.click(findTestObject('a_Your gists'))

WebUI.click(findTestObject('selectExistingGist'))

WebUI.click(findTestObject('buttonDelete'))

WebUI.waitForAlert(2)

WebUI.verifyAlertPresent(2)

WebUI.acceptAlert()

WebUI.click(findTestObject('clickAva'))

WebUI.click(findTestObject('a_Your gists'))

