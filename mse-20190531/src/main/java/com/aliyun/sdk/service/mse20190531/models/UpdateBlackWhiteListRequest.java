// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBlackWhiteListRequest} extends {@link RequestModel}
 *
 * <p>UpdateBlackWhiteListRequest</p>
 */
public class UpdateBlackWhiteListRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("Content")
    private String content;

    @Query
    @NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("IsWhite")
    private Boolean isWhite;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Note")
    private String note;

    @Query
    @NameInMap("ResourceIdJsonList")
    private String resourceIdJsonList;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("Type")
    private String type;

    private UpdateBlackWhiteListRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.content = builder.content;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.id = builder.id;
        this.isWhite = builder.isWhite;
        this.name = builder.name;
        this.note = builder.note;
        this.resourceIdJsonList = builder.resourceIdJsonList;
        this.resourceType = builder.resourceType;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBlackWhiteListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return isWhite
     */
    public Boolean getIsWhite() {
        return this.isWhite;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return note
     */
    public String getNote() {
        return this.note;
    }

    /**
     * @return resourceIdJsonList
     */
    public String getResourceIdJsonList() {
        return this.resourceIdJsonList;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UpdateBlackWhiteListRequest, Builder> {
        private String acceptLanguage; 
        private String content; 
        private String gatewayUniqueId; 
        private Long id; 
        private Boolean isWhite; 
        private String name; 
        private String note; 
        private String resourceIdJsonList; 
        private String resourceType; 
        private String status; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBlackWhiteListRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.content = request.content;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.id = request.id;
            this.isWhite = request.isWhite;
            this.name = request.name;
            this.note = request.note;
            this.resourceIdJsonList = request.resourceIdJsonList;
            this.resourceType = request.resourceType;
            this.status = request.status;
            this.type = request.type;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The content of the blacklist.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * The unique ID of the gateway.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * The ID of the blacklist.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The whitelist. Default value: No.
         */
        public Builder isWhite(Boolean isWhite) {
            this.putQueryParameter("IsWhite", isWhite);
            this.isWhite = isWhite;
            return this;
        }

        /**
         * The name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The description.
         */
        public Builder note(String note) {
            this.putQueryParameter("Note", note);
            this.note = note;
            return this;
        }

        /**
         * The resource IDs in the JSON format.
         */
        public Builder resourceIdJsonList(String resourceIdJsonList) {
            this.putQueryParameter("ResourceIdJsonList", resourceIdJsonList);
            this.resourceIdJsonList = resourceIdJsonList;
            return this;
        }

        /**
         * The type of the resource.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Specifies whether to enable the blacklist or whitelist.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The type of the blacklist or whitelist.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateBlackWhiteListRequest build() {
            return new UpdateBlackWhiteListRequest(this);
        } 

    } 

}
