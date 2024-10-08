// Generated by Ktorfit
@file:Suppress("warnings")

package org.openapitools.client.apis

import de.jensklingenberg.ktorfit.Ktorfit
import de.jensklingenberg.ktorfit.`internal`.ClassProvider
import de.jensklingenberg.ktorfit.`internal`.InternalKtorfitApi
import de.jensklingenberg.ktorfit.`internal`.KtorfitConverterHelper
import de.jensklingenberg.ktorfit.converter.TypeData
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.headers
import io.ktor.client.request.parameter
import io.ktor.client.request.setBody
import io.ktor.http.HttpMethod
import io.ktor.http.URLBuilder
import io.ktor.http.decodeURLQueryComponent
import io.ktor.http.encodeURLPath
import io.ktor.http.takeFrom
import io.ktor.util.reflect.typeInfo
import kotlin.Long
import kotlin.OptIn
import kotlin.Suppress
import kotlin.collections.List
import org.openapitools.client.models.DeleteSelfBeneficiariesTPTBeneficiaryIdResponse
import org.openapitools.client.models.GetSelfBeneficiariesTPTResponse
import org.openapitools.client.models.GetSelfBeneficiariesTPTTemplateResponse
import org.openapitools.client.models.PostSelfBeneficiariesTPTRequest
import org.openapitools.client.models.PostSelfBeneficiariesTPTResponse
import org.openapitools.client.models.PutSelfBeneficiariesTPTBeneficiaryIdRequest
import org.openapitools.client.models.PutSelfBeneficiariesTPTBeneficiaryIdResponse

@OptIn(InternalKtorfitApi::class)
public class _SelfThirdPartyTransferApiImpl(
  private val _ktorfit: Ktorfit,
) : SelfThirdPartyTransferApi {
  private val _helper: KtorfitConverterHelper = KtorfitConverterHelper(_ktorfit)

  override suspend fun add(postSelfBeneficiariesTPTRequest: PostSelfBeneficiariesTPTRequest):
      PostSelfBeneficiariesTPTResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/self/beneficiaries/tpt")
        }
        setBody(postSelfBeneficiariesTPTRequest) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PostSelfBeneficiariesTPTResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun delete22(beneficiaryId: Long):
      DeleteSelfBeneficiariesTPTBeneficiaryIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("DELETE")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/self/beneficiaries/tpt/${"$beneficiaryId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<DeleteSelfBeneficiariesTPTBeneficiaryIdResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveAll35(): List<GetSelfBeneficiariesTPTResponse> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/self/beneficiaries/tpt")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<List<GetSelfBeneficiariesTPTResponse>>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun template16(): GetSelfBeneficiariesTPTTemplateResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/self/beneficiaries/tpt/template")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetSelfBeneficiariesTPTTemplateResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun update23(beneficiaryId: Long,
      putSelfBeneficiariesTPTBeneficiaryIdRequest: PutSelfBeneficiariesTPTBeneficiaryIdRequest):
      PutSelfBeneficiariesTPTBeneficiaryIdResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("PUT")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/self/beneficiaries/tpt/${"$beneficiaryId".encodeURLPath()}")
        }
        setBody(putSelfBeneficiariesTPTBeneficiaryIdRequest) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PutSelfBeneficiariesTPTBeneficiaryIdResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }
}

public class _SelfThirdPartyTransferApiProvider : ClassProvider<SelfThirdPartyTransferApi> {
  override fun create(_ktorfit: Ktorfit): SelfThirdPartyTransferApi =
      _SelfThirdPartyTransferApiImpl(_ktorfit)
}

public fun Ktorfit.createSelfThirdPartyTransferApi(): SelfThirdPartyTransferApi =
    _SelfThirdPartyTransferApiImpl(this)
