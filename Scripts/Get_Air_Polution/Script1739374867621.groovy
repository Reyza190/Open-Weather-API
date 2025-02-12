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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Thread.sleep(1000)

response = WS.sendRequestAndVerify(findTestObject('API/REST/GetAirPolution'))

WS.verifyResponseStatusCode(response, 200)

WS.validateJsonAgainstSchema(response, 'Include/schemas/AirPolutionSchema.json')

WS.verifyElementText(response, 'coord.lon', GlobalVariable.lon.toString())

WS.verifyElementText(response, 'coord.lat', GlobalVariable.lat.toString())

def aqi = WS.getElementPropertyValue(response, 'list[0].main.aqi')

WS.verifyNotEqual(aqi, null, FailureHandling.STOP_ON_FAILURE)

WS.verifyGreaterThanOrEqual(aqi, Integer.valueOf(1), FailureHandling.STOP_ON_FAILURE)
WS.verifyLessThanOrEqual(aqi, Integer.valueOf(5), FailureHandling.STOP_ON_FAILURE)
