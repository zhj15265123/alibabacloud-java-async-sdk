// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryKnowledgesRequest} extends {@link RequestModel}
 *
 * <p>QueryKnowledgesRequest</p>
 */
public class QueryKnowledgesRequest extends Request {
    @Query
    @NameInMap("CategoryId")
    private Long categoryId;

    @Query
    @NameInMap("CoreWordName")
    private String coreWordName;

    @Query
    @NameInMap("KnowledgeTitle")
    private String knowledgeTitle;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private QueryKnowledgesRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
        this.coreWordName = builder.coreWordName;
        this.knowledgeTitle = builder.knowledgeTitle;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryKnowledgesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return coreWordName
     */
    public String getCoreWordName() {
        return this.coreWordName;
    }

    /**
     * @return knowledgeTitle
     */
    public String getKnowledgeTitle() {
        return this.knowledgeTitle;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<QueryKnowledgesRequest, Builder> {
        private Long categoryId; 
        private String coreWordName; 
        private String knowledgeTitle; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(QueryKnowledgesRequest response) {
            super(response);
            this.categoryId = response.categoryId;
            this.coreWordName = response.coreWordName;
            this.knowledgeTitle = response.knowledgeTitle;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
        } 

        /**
         * CategoryId.
         */
        public Builder categoryId(Long categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * CoreWordName.
         */
        public Builder coreWordName(String coreWordName) {
            this.putQueryParameter("CoreWordName", coreWordName);
            this.coreWordName = coreWordName;
            return this;
        }

        /**
         * KnowledgeTitle.
         */
        public Builder knowledgeTitle(String knowledgeTitle) {
            this.putQueryParameter("KnowledgeTitle", knowledgeTitle);
            this.knowledgeTitle = knowledgeTitle;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public QueryKnowledgesRequest build() {
            return new QueryKnowledgesRequest(this);
        } 

    } 

}
