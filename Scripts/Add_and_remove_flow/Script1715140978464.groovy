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

WebUI.click(findTestObject('Product/product_bike_light'))

WebUI.verifyElementVisible(findTestObject('Detail_Product/verify_bike_light'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Detail_Product/button_add'))

WebUI.verifyElementVisible(findTestObject('Detail_Product/cart_container'))

WebUI.click(findTestObject('Detail_Product/remove'))

WebUI.click(findTestObject('Detail_Product/back_to_products'))

WebUI.verifyElementVisible(findTestObject('success_login/verify_page'))

WebUI.verifyElementVisible(findTestObject('success_login/verify_products'))

WebUI.click(findTestObject('Product/product_backpack'))

WebUI.verifyElementVisible(findTestObject('Detail_Product/verify_backpack'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Detail_Product/button_add'))

WebUI.click(findTestObject('Detail_Product/cart_container'))

