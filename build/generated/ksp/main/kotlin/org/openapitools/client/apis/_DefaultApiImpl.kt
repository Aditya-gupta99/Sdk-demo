// Generated by Ktorfit
@file:Suppress("warnings")

package org.openapitools.client.apis

import de.jensklingenberg.ktorfit.Ktorfit
import de.jensklingenberg.ktorfit.`internal`.ClassProvider
import de.jensklingenberg.ktorfit.`internal`.InternalKtorfitApi
import de.jensklingenberg.ktorfit.`internal`.KtorfitConverterHelper
import de.jensklingenberg.ktorfit.converter.TypeData
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.forms.FormDataContent
import io.ktor.client.request.forms.MultiPartFormDataContent
import io.ktor.client.request.forms.formData
import io.ktor.client.request.headers
import io.ktor.client.request.parameter
import io.ktor.client.request.setBody
import io.ktor.http.HttpMethod
import io.ktor.http.Parameters
import io.ktor.http.URLBuilder
import io.ktor.http.decodeURLQueryComponent
import io.ktor.http.encodeURLPath
import io.ktor.http.takeFrom
import io.ktor.util.reflect.typeInfo
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.OptIn
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import okhttp3.MultipartBody
import org.openapitools.client.models.AdvancedPaymentData
import org.openapitools.client.models.CommandProcessingResult
import org.openapitools.client.models.CommandWrapper
import org.openapitools.client.models.SmsCampaignData

@OptIn(InternalKtorfitApi::class)
public class _DefaultApiImpl(
  private val _ktorfit: Ktorfit,
) : DefaultApi {
  private val _helper: KtorfitConverterHelper = KtorfitConverterHelper(_ktorfit)

  override suspend fun activate(
    resourceId: Long,
    command: String?,
    body: String?,
  ): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/email/campaign/${"$resourceId".encodeURLPath()}")
        command?.let{ parameter("command", "$it") }
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun addCreditReport(
    creditBureauId: Long?,
    dateFormat: String,
    locale: String,
    uploadedInputStream: MultipartBody.Part,
  ): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/creditBureauIntegration/addCreditReport")
        creditBureauId?.let{ parameter("creditBureauId", "$it") }
        }
        val __formData = formData {
        dateFormat?.let{ append("dateFormat", "${it}") }
        locale?.let{ append("locale", "${it}") }
        uploadedInputStream?.let{ append("", "${it}") }
        }
        setBody(MultiPartFormDataContent(__formData))
         
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun addNewClientImage1(
    entity: String,
    entityId: Long,
    contentLength: Long?,
    dateFormat: String,
    locale: String,
    uploadedInputStream: MultipartBody.Part,
  ): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/${"$entity".encodeURLPath()}/${"$entityId".encodeURLPath()}/images")
        }
        headers{
        contentLength?.let{ append("Content-Length", "$contentLength") }
        }
        val __formData = formData {
        dateFormat?.let{ append("dateFormat", "${it}") }
        locale?.let{ append("locale", "${it}") }
        uploadedInputStream?.let{ append("", "${it}") }
        }
        setBody(MultiPartFormDataContent(__formData))
         
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun create1(body: String?): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/email")
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun createCampaign(body: String?): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/email/campaign")
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun createCampaign1(commandWrapper: CommandWrapper): CommandProcessingResult {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/smscampaigns")
        }
        setBody(commandWrapper) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<CommandProcessingResult>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun delete1(resourceId: Long): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("DELETE")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/email/${"$resourceId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun delete2(resourceId: Long): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("DELETE")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/email/campaign/${"$resourceId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun delete3(campaignId: Long): CommandProcessingResult {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("DELETE")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/smscampaigns/${"$campaignId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<CommandProcessingResult>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun delete8(transactionId: Long): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("DELETE")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/officetransactions/${"$transactionId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun deleteClientImage(entity: String, entityId: Long): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("DELETE")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/${"$entity".encodeURLPath()}/${"$entityId".encodeURLPath()}/images")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun deleteCreditReport(creditBureauId: Long): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("DELETE")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/creditBureauIntegration/deleteCreditReport/${"$creditBureauId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun fetchCreditReport(body: Any?): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/creditBureauIntegration/creditReport")
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun `get`(): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/echo")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun getAdvancedPaymentAllocationRulesOfLoan(loanId: Long):
      List<AdvancedPaymentData> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/internal/loan/${"$loanId".encodeURLPath()}/advanced-payment-allocation-rules")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<List<AdvancedPaymentData>>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun getClientAuditFields(clientId: Long): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/internal/client/${"$clientId".encodeURLPath()}/audit")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun getCobPartitions(partitionSize: Int): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/internal/cob/partitions/${"$partitionSize".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun getExternalGrammar(path: String) {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "application.wadl/${"$path".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<Unit>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun getLoanAuditFields(loanId: Long): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/internal/loan/${"$loanId".encodeURLPath()}/audit")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun getLoanTransactionAuditFields(loanId: Long, transactionId: Long): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/internal/loan/${"$loanId".encodeURLPath()}/transaction/${"$transactionId".encodeURLPath()}/audit")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun getLoansByStatus(statusId: Int): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/internal/loan/status/${"$statusId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun getSavedCreditReport(creditBureauId: Long): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/creditBureauIntegration/creditReport/${"$creditBureauId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun getWadl() {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "application.wadl")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<Unit>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun handleCommands(campaignId: Long, command: String?): CommandProcessingResult {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/smscampaigns/${"$campaignId".encodeURLPath()}")
        command?.let{ parameter("command", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<CommandProcessingResult>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun newOfficeTransactionDetails(): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/officetransactions/template")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun placeLockOnLoanAccount(
    loanId: Long,
    lockOwner: String,
    body: String?,
  ) {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/internal/loans/${"$loanId".encodeURLPath()}/place-lock/${"$lockOwner".encodeURLPath()}")
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<Unit>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun preview(body: String?): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/email/campaign/preview")
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun preview1(body: String?): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/smscampaigns/preview")
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveAll5(): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/email/configuration")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveAll9(): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/twofactor/configure")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveAllCampaign(): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/email/campaign")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveAllEmailByStatus(
    sqlSearch: String?,
    offset: Int?,
    limit: Int?,
    status: Int?,
    orderBy: String?,
    sortOrder: String?,
    fromDate: String?,
    toDate: String?,
    locale: String?,
    dateFormat: String?,
  ): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/email/messageByStatus")
        sqlSearch?.let{ parameter("sqlSearch", "$it") }
        offset?.let{ parameter("offset", "$it") }
        limit?.let{ parameter("limit", "$it") }
        status?.let{ parameter("status", "$it") }
        orderBy?.let{ parameter("orderBy", "$it") }
        sortOrder?.let{ parameter("sortOrder", "$it") }
        fromDate?.let{ parameter("fromDate", "$it") }
        toDate?.let{ parameter("toDate", "$it") }
        locale?.let{ parameter("locale", "$it") }
        dateFormat?.let{ parameter("dateFormat", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveAllEmails(): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/email")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveAllEmails1(
    offset: Int?,
    limit: Int?,
    orderBy: String?,
    sortOrder: String?,
  ): SmsCampaignData {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/smscampaigns")
        offset?.let{ parameter("offset", "$it") }
        limit?.let{ parameter("limit", "$it") }
        orderBy?.let{ parameter("orderBy", "$it") }
        sortOrder?.let{ parameter("sortOrder", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<SmsCampaignData>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveCampaign(resourceId: Long): SmsCampaignData {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/smscampaigns/${"$resourceId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<SmsCampaignData>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveFailedEmail(
    sqlSearch: String?,
    offset: Int?,
    limit: Int?,
    orderBy: String?,
    sortOrder: String?,
  ): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/email/failedEmail")
        sqlSearch?.let{ parameter("sqlSearch", "$it") }
        offset?.let{ parameter("offset", "$it") }
        limit?.let{ parameter("limit", "$it") }
        orderBy?.let{ parameter("orderBy", "$it") }
        sortOrder?.let{ parameter("sortOrder", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveImage(
    entity: String,
    entityId: Long,
    maxWidth: Int?,
    maxHeight: Int?,
    output: String?,
    accept: String?,
  ) {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/${"$entity".encodeURLPath()}/${"$entityId".encodeURLPath()}/images")
        maxWidth?.let{ parameter("maxWidth", "$it") }
        maxHeight?.let{ parameter("maxHeight", "$it") }
        output?.let{ parameter("output", "$it") }
        }
        headers{
        accept?.let{ append("Accept", accept) }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<Unit>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveOfficeTransactions(): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/officetransactions")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveOne1(resourceId: Long): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/email/${"$resourceId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveOneCampaign(resourceId: Long): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/email/campaign/${"$resourceId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveOneTemplate(resourceId: Long): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/email/campaign/template/${"$resourceId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrievePendingEmail(
    offset: Int?,
    limit: Int?,
    orderBy: String?,
    sortOrder: String?,
  ): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/email/pendingEmail")
        offset?.let{ parameter("offset", "$it") }
        limit?.let{ parameter("limit", "$it") }
        orderBy?.let{ parameter("orderBy", "$it") }
        sortOrder?.let{ parameter("sortOrder", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveSentEmail(
    offset: Int?,
    limit: Int?,
    orderBy: String?,
    sortOrder: String?,
  ): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/email/sentEmail")
        offset?.let{ parameter("offset", "$it") }
        limit?.let{ parameter("limit", "$it") }
        orderBy?.let{ parameter("orderBy", "$it") }
        sortOrder?.let{ parameter("sortOrder", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun saveCreditReport(creditBureauId: Long?, nationalId: String?): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/creditBureauIntegration/saveCreditReport")
        creditBureauId?.let{ parameter("creditBureauId", "$it") }
        nationalId?.let{ parameter("nationalId", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun template1(): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/email/campaign/template")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun template2(): SmsCampaignData {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/smscampaigns/template")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<SmsCampaignData>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun transferMoneyFrom(body: String?): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/officetransactions")
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun update2(resourceId: Long, body: String?): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/email/${"$resourceId".encodeURLPath()}")
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun updateCampaign(resourceId: Long, body: String?): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/email/campaign/${"$resourceId".encodeURLPath()}")
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun updateCampaign1(campaignId: Long, commandWrapper: CommandWrapper):
      CommandProcessingResult {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/smscampaigns/${"$campaignId".encodeURLPath()}")
        }
        setBody(commandWrapper) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<CommandProcessingResult>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun updateClientImage1(
    entity: String,
    entityId: Long,
    contentLength: Long?,
    dateFormat: String,
    locale: String,
    uploadedInputStream: MultipartBody.Part,
  ): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/${"$entity".encodeURLPath()}/${"$entityId".encodeURLPath()}/images")
        }
        headers{
        contentLength?.let{ append("Content-Length", "$contentLength") }
        }
        val __formData = formData {
        dateFormat?.let{ append("dateFormat", "${it}") }
        locale?.let{ append("locale", "${it}") }
        uploadedInputStream?.let{ append("", "${it}") }
        }
        setBody(MultiPartFormDataContent(__formData))
         
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun updateConfiguration(body: String?): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/email/configuration")
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun updateConfiguration3(body: String?): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/twofactor/configure")
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<String>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }
}

public class _DefaultApiProvider : ClassProvider<DefaultApi> {
  override fun create(_ktorfit: Ktorfit): DefaultApi = _DefaultApiImpl(_ktorfit)
}

public fun Ktorfit.createDefaultApi(): DefaultApi = _DefaultApiImpl(this)
