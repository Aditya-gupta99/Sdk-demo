package org.openapitools.client.apis

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapitools.client.models.PageClientSearchData
import org.openapitools.client.models.PagedRequestClientTextSearch

interface ClientSearchV2Api {
    /**
     * Search Clients by text
     * 
     * Responses:
     *  - 0: default response
     *
     * @param pagedRequestClientTextSearch  (optional)
     * @return [PageClientSearchData]
     */
    @POST("v2/clients/search")
    suspend fun searchByText(@Body pagedRequestClientTextSearch: PagedRequestClientTextSearch? = null): Response<PageClientSearchData>

}
