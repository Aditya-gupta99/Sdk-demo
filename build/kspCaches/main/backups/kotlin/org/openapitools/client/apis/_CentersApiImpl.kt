// Generated by Ktorfit
@file:Suppress("warnings")

package org.openapitools.client.apis

import de.jensklingenberg.ktorfit.Ktorfit
import de.jensklingenberg.ktorfit.`internal`.InternalKtorfitApi
import de.jensklingenberg.ktorfit.`internal`.KtorfitConverterHelper
import de.jensklingenberg.ktorfit.`internal`.KtorfitInterface
import de.jensklingenberg.ktorfit.`internal`.TypeData
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.OptIn
import kotlin.String
import kotlin.Suppress
import okhttp3.MultipartBody
import org.openapitools.client.models.DeleteCentersCenterIdResponse
import org.openapitools.client.models.GetCentersCenterIdAccountsResponse
import org.openapitools.client.models.GetCentersCenterIdResponse
import org.openapitools.client.models.GetCentersResponse
import org.openapitools.client.models.GetCentersTemplateResponse
import org.openapitools.client.models.PostCentersCenterIdRequest
import org.openapitools.client.models.PostCentersCenterIdResponse
import org.openapitools.client.models.PostCentersRequest
import org.openapitools.client.models.PostCentersResponse
import org.openapitools.client.models.PutCentersCenterIdRequest
import org.openapitools.client.models.PutCentersCenterIdResponse

@OptIn(InternalKtorfitApi::class)
public class _CentersApiImpl : CentersApi, KtorfitInterface {
  override lateinit var _converter: KtorfitConverterHelper

  override suspend fun activate2(
    centerId: Long,
    postCentersCenterIdRequest: PostCentersCenterIdRequest,
    command: String?,
  ): PostCentersCenterIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_converter.baseUrl + "v1/centers/${"$centerId".encodeURLPath()}")
        command?.let{ parameter("command", "$it") }
        }
        setBody(postCentersCenterIdRequest) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.PostCentersCenterIdResponse",
    typeInfo = typeInfo<org.openapitools.client.models.PostCentersCenterIdResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.PostCentersCenterIdResponse,
        org.openapitools.client.models.PostCentersCenterIdResponse>(_typeData,_ext)!!
  }

  override suspend fun create7(postCentersRequest: PostCentersRequest): PostCentersResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_converter.baseUrl + "v1/centers")
        }
        setBody(postCentersRequest) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.PostCentersResponse",
    typeInfo = typeInfo<org.openapitools.client.models.PostCentersResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.PostCentersResponse,
        org.openapitools.client.models.PostCentersResponse>(_typeData,_ext)!!
  }

  override suspend fun delete11(centerId: Long): DeleteCentersCenterIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("DELETE")
        url{
        takeFrom(_converter.baseUrl + "v1/centers/${"$centerId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.DeleteCentersCenterIdResponse",
    typeInfo = typeInfo<org.openapitools.client.models.DeleteCentersCenterIdResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.DeleteCentersCenterIdResponse,
        org.openapitools.client.models.DeleteCentersCenterIdResponse>(_typeData,_ext)!!
  }

  override suspend fun getCentersTemplate(
    officeId: Long?,
    staffId: Long?,
    dateFormat: String?,
  ) {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/centers/downloadtemplate")
        officeId?.let{ parameter("officeId", "$it") }
        staffId?.let{ parameter("staffId", "$it") }
        dateFormat?.let{ parameter("dateFormat", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "kotlin.Unit",
    typeInfo = typeInfo<kotlin.Unit>())

    return _converter.suspendRequest<kotlin.Unit, kotlin.Unit>(_typeData,_ext)!!
  }

  override suspend fun postCentersTemplate(
    dateFormat: String,
    locale: String,
    uploadedInputStream: MultipartBody.Part,
  ): String {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_converter.baseUrl + "v1/centers/uploadtemplate")
        }
        val __formData = formData {
        dateFormat?.let{ append("dateFormat", "${it}") }
        locale?.let{ append("locale", "${it}") }
        uploadedInputStream?.let{ append("", "${it}") }
        }
        setBody(MultiPartFormDataContent(__formData))
         
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "kotlin.String",
    typeInfo = typeInfo<kotlin.String>())

    return _converter.suspendRequest<kotlin.String, kotlin.String>(_typeData,_ext)!!
  }

  override suspend fun retrieveAll23(
    officeId: Long?,
    staffId: Long?,
    externalId: String?,
    name: String?,
    underHierarchy: String?,
    paged: Boolean?,
    offset: Int?,
    limit: Int?,
    orderBy: String?,
    sortOrder: String?,
    meetingDate: String?,
    dateFormat: String?,
    locale: String?,
  ): GetCentersResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/centers")
        officeId?.let{ parameter("officeId", "$it") }
        staffId?.let{ parameter("staffId", "$it") }
        externalId?.let{ parameter("externalId", "$it") }
        name?.let{ parameter("name", "$it") }
        underHierarchy?.let{ parameter("underHierarchy", "$it") }
        paged?.let{ parameter("paged", "$it") }
        offset?.let{ parameter("offset", "$it") }
        limit?.let{ parameter("limit", "$it") }
        orderBy?.let{ parameter("orderBy", "$it") }
        sortOrder?.let{ parameter("sortOrder", "$it") }
        meetingDate?.let{ parameter("meetingDate", "$it") }
        dateFormat?.let{ parameter("dateFormat", "$it") }
        locale?.let{ parameter("locale", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.GetCentersResponse",
    typeInfo = typeInfo<org.openapitools.client.models.GetCentersResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.GetCentersResponse,
        org.openapitools.client.models.GetCentersResponse>(_typeData,_ext)!!
  }

  override suspend fun retrieveGroupAccount(centerId: Long): GetCentersCenterIdAccountsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/centers/${"$centerId".encodeURLPath()}/accounts")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.GetCentersCenterIdAccountsResponse",
    typeInfo = typeInfo<org.openapitools.client.models.GetCentersCenterIdAccountsResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.GetCentersCenterIdAccountsResponse,
        org.openapitools.client.models.GetCentersCenterIdAccountsResponse>(_typeData,_ext)!!
  }

  override suspend fun retrieveOne14(centerId: Long, staffInSelectedOfficeOnly: Boolean?):
      GetCentersCenterIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/centers/${"$centerId".encodeURLPath()}")
        staffInSelectedOfficeOnly?.let{ parameter("staffInSelectedOfficeOnly", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.GetCentersCenterIdResponse",
    typeInfo = typeInfo<org.openapitools.client.models.GetCentersCenterIdResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.GetCentersCenterIdResponse,
        org.openapitools.client.models.GetCentersCenterIdResponse>(_typeData,_ext)!!
  }

  override suspend fun retrieveTemplate6(
    command: String?,
    officeId: Long?,
    staffInSelectedOfficeOnly: Boolean?,
  ): GetCentersTemplateResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/centers/template")
        command?.let{ parameter("command", "$it") }
        officeId?.let{ parameter("officeId", "$it") }
        staffInSelectedOfficeOnly?.let{ parameter("staffInSelectedOfficeOnly", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.GetCentersTemplateResponse",
    typeInfo = typeInfo<org.openapitools.client.models.GetCentersTemplateResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.GetCentersTemplateResponse,
        org.openapitools.client.models.GetCentersTemplateResponse>(_typeData,_ext)!!
  }

  override suspend fun update12(centerId: Long,
      putCentersCenterIdRequest: PutCentersCenterIdRequest): PutCentersCenterIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_converter.baseUrl + "v1/centers/${"$centerId".encodeURLPath()}")
        }
        setBody(putCentersCenterIdRequest) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.PutCentersCenterIdResponse",
    typeInfo = typeInfo<org.openapitools.client.models.PutCentersCenterIdResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.PutCentersCenterIdResponse,
        org.openapitools.client.models.PutCentersCenterIdResponse>(_typeData,_ext)!!
  }
}

public fun Ktorfit.createCentersApi(): CentersApi = this.create(_CentersApiImpl().apply {
    _converter= KtorfitConverterHelper(this@createCentersApi) })
