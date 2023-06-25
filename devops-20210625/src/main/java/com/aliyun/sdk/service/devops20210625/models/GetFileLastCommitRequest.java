// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileLastCommitRequest} extends {@link RequestModel}
 *
 * <p>GetFileLastCommitRequest</p>
 */
public class GetFileLastCommitRequest extends Request {
    @Path
    @NameInMap("repositoryId")
    @Validation(required = true)
    private Long repositoryId;

    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Query
    @NameInMap("filePath")
    @Validation(required = true)
    private String filePath;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("sha")
    @Validation(required = true)
    private String sha;

    @Query
    @NameInMap("showSignature")
    private Boolean showSignature;

    private GetFileLastCommitRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.accessToken = builder.accessToken;
        this.filePath = builder.filePath;
        this.organizationId = builder.organizationId;
        this.sha = builder.sha;
        this.showSignature = builder.showSignature;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileLastCommitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return repositoryId
     */
    public Long getRepositoryId() {
        return this.repositoryId;
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return sha
     */
    public String getSha() {
        return this.sha;
    }

    /**
     * @return showSignature
     */
    public Boolean getShowSignature() {
        return this.showSignature;
    }

    public static final class Builder extends Request.Builder<GetFileLastCommitRequest, Builder> {
        private Long repositoryId; 
        private String accessToken; 
        private String filePath; 
        private String organizationId; 
        private String sha; 
        private Boolean showSignature; 

        private Builder() {
            super();
        } 

        private Builder(GetFileLastCommitRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.accessToken = request.accessToken;
            this.filePath = request.filePath;
            this.organizationId = request.organizationId;
            this.sha = request.sha;
            this.showSignature = request.showSignature;
        } 

        /**
         * repositoryId.
         */
        public Builder repositoryId(Long repositoryId) {
            this.putPathParameter("repositoryId", repositoryId);
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * accessToken.
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("accessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * filePath.
         */
        public Builder filePath(String filePath) {
            this.putQueryParameter("filePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * sha.
         */
        public Builder sha(String sha) {
            this.putQueryParameter("sha", sha);
            this.sha = sha;
            return this;
        }

        /**
         * showSignature.
         */
        public Builder showSignature(Boolean showSignature) {
            this.putQueryParameter("showSignature", showSignature);
            this.showSignature = showSignature;
            return this;
        }

        @Override
        public GetFileLastCommitRequest build() {
            return new GetFileLastCommitRequest(this);
        } 

    } 

}
