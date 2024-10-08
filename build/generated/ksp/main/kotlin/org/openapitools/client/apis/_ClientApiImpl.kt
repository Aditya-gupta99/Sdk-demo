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
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.OptIn
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import okhttp3.MultipartBody
import org.openapitools.client.models.DeleteClientsClientIdResponse
import org.openapitools.client.models.GetClientObligeeDetailsResponse
import org.openapitools.client.models.GetClientTransferProposalDateResponse
import org.openapitools.client.models.GetClientsClientIdAccountsResponse
import org.openapitools.client.models.GetClientsClientIdResponse
import org.openapitools.client.models.GetClientsResponse
import org.openapitools.client.models.GetClientsTemplateResponse
import org.openapitools.client.models.PostClientsClientIdRequest
import org.openapitools.client.models.PostClientsClientIdResponse
import org.openapitools.client.models.PostClientsRequest
import org.openapitools.client.models.PostClientsResponse
import org.openapitools.client.models.PutClientsClientIdRequest
import org.openapitools.client.models.PutClientsClientIdResponse

@OptIn(InternalKtorfitApi::class)
public class _ClientApiImpl(
  private val _ktorfit: Ktorfit,
) : ClientApi {
  private val _helper: KtorfitConverterHelper = KtorfitConverterHelper(_ktorfit)

  override suspend fun activate1(
    clientId: Long,
    postClientsClientIdRequest: PostClientsClientIdRequest,
    command: String?,
  ): PostClientsClientIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/clients/${"$clientId".encodeURLPath()}")
        command?.let{ parameter("command", "$it") }
        }
        setBody(postClientsClientIdRequest) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PostClientsClientIdResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun applyCommand(
    externalId: String,
    postClientsClientIdRequest: PostClientsClientIdRequest,
    command: String?,
  ): PostClientsClientIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/clients/external-id/${"$externalId".encodeURLPath()}")
        command?.let{ parameter("command", "$it") }
        }
        setBody(postClientsClientIdRequest) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PostClientsClientIdResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun create6(postClientsRequest: PostClientsRequest): PostClientsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/clients")
        }
        setBody(postClientsRequest) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PostClientsResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun delete10(externalId: String, body: Any): DeleteClientsClientIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("DELETE")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/clients/external-id/${"$externalId".encodeURLPath()}")
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<DeleteClientsClientIdResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun delete9(clientId: Long, body: Any): DeleteClientsClientIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("DELETE")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/clients/${"$clientId".encodeURLPath()}")
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<DeleteClientsClientIdResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun getClientTemplate(
    legalFormType: String?,
    officeId: Long?,
    staffId: Long?,
    dateFormat: String?,
  ) {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/clients/downloadtemplate")
        legalFormType?.let{ parameter("legalFormType", "$it") }
        officeId?.let{ parameter("officeId", "$it") }
        staffId?.let{ parameter("staffId", "$it") }
        dateFormat?.let{ parameter("dateFormat", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<Unit>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun postClientTemplate(
    legalFormType: String?,
    dateFormat: String,
    locale: String,
    uploadedInputStream: MultipartBody.Part,
  ): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/clients/uploadtemplate")
        legalFormType?.let{ parameter("legalFormType", "$it") }
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

  override suspend fun retrieveAll21(
    officeId: Long?,
    externalId: String?,
    displayName: String?,
    firstName: String?,
    lastName: String?,
    status: String?,
    underHierarchy: String?,
    offset: Int?,
    limit: Int?,
    orderBy: String?,
    sortOrder: String?,
    orphansOnly: Boolean?,
  ): GetClientsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/clients")
        officeId?.let{ parameter("officeId", "$it") }
        externalId?.let{ parameter("externalId", "$it") }
        displayName?.let{ parameter("displayName", "$it") }
        firstName?.let{ parameter("firstName", "$it") }
        lastName?.let{ parameter("lastName", "$it") }
        status?.let{ parameter("status", "$it") }
        underHierarchy?.let{ parameter("underHierarchy", "$it") }
        offset?.let{ parameter("offset", "$it") }
        limit?.let{ parameter("limit", "$it") }
        orderBy?.let{ parameter("orderBy", "$it") }
        sortOrder?.let{ parameter("sortOrder", "$it") }
        orphansOnly?.let{ parameter("orphansOnly", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetClientsResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveAssociatedAccounts(clientId: Long):
      GetClientsClientIdAccountsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/clients/${"$clientId".encodeURLPath()}/accounts")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetClientsClientIdAccountsResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveAssociatedAccounts1(externalId: String):
      GetClientsClientIdAccountsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/clients/external-id/${"$externalId".encodeURLPath()}/accounts")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetClientsClientIdAccountsResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveObligeeDetails(clientId: Long): GetClientObligeeDetailsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/clients/${"$clientId".encodeURLPath()}/obligeedetails")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetClientObligeeDetailsResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveObligeeDetails1(externalId: String):
      GetClientObligeeDetailsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/clients/external-id/${"$externalId".encodeURLPath()}/obligeedetails")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetClientObligeeDetailsResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveOne11(clientId: Long, staffInSelectedOfficeOnly: Boolean?):
      GetClientsClientIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/clients/${"$clientId".encodeURLPath()}")
        staffInSelectedOfficeOnly?.let{ parameter("staffInSelectedOfficeOnly", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetClientsClientIdResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveOne12(externalId: String, staffInSelectedOfficeOnly: Boolean?):
      GetClientsClientIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/clients/external-id/${"$externalId".encodeURLPath()}")
        staffInSelectedOfficeOnly?.let{ parameter("staffInSelectedOfficeOnly", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetClientsClientIdResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveTemplate5(
    officeId: Long?,
    commandParam: String?,
    staffInSelectedOfficeOnly: Boolean?,
  ): GetClientsTemplateResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/clients/template")
        officeId?.let{ parameter("officeId", "$it") }
        commandParam?.let{ parameter("commandParam", "$it") }
        staffInSelectedOfficeOnly?.let{ parameter("staffInSelectedOfficeOnly", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetClientsTemplateResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveTransferTemplate(clientId: Long):
      GetClientTransferProposalDateResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/clients/${"$clientId".encodeURLPath()}/transferproposaldate")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetClientTransferProposalDateResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveTransferTemplate1(externalId: String):
      GetClientTransferProposalDateResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/clients/external-id/${"$externalId".encodeURLPath()}/transferproposaldate")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetClientTransferProposalDateResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun update10(clientId: Long,
      putClientsClientIdRequest: PutClientsClientIdRequest): PutClientsClientIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/clients/${"$clientId".encodeURLPath()}")
        }
        setBody(putClientsClientIdRequest) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PutClientsClientIdResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun update11(externalId: String,
      putClientsClientIdRequest: PutClientsClientIdRequest): PutClientsClientIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/clients/external-id/${"$externalId".encodeURLPath()}")
        }
        setBody(putClientsClientIdRequest) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PutClientsClientIdResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }
}

public class _ClientApiProvider : ClassProvider<ClientApi> {
  override fun create(_ktorfit: Ktorfit): ClientApi = _ClientApiImpl(_ktorfit)
}

public fun Ktorfit.createClientApi(): ClientApi = _ClientApiImpl(this)
