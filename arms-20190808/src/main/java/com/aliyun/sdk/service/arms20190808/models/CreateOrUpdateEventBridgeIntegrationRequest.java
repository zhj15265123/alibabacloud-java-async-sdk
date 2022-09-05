// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateEventBridgeIntegrationRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateEventBridgeIntegrationRequest</p>
 */
public class CreateOrUpdateEventBridgeIntegrationRequest extends Request {
    @Body
    @NameInMap("AccessKey")
    private String accessKey;

    @Body
    @NameInMap("AccessSecret")
    private String accessSecret;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Endpoint")
    private String endpoint;

    @Body
    @NameInMap("EventBusName")
    private String eventBusName;

    @Body
    @NameInMap("EventBusRegionId")
    private String eventBusRegionId;

    @Body
    @NameInMap("Id")
    private Long id;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("Source")
    private String source;

    private CreateOrUpdateEventBridgeIntegrationRequest(Builder builder) {
        super(builder);
        this.accessKey = builder.accessKey;
        this.accessSecret = builder.accessSecret;
        this.description = builder.description;
        this.endpoint = builder.endpoint;
        this.eventBusName = builder.eventBusName;
        this.eventBusRegionId = builder.eventBusRegionId;
        this.id = builder.id;
        this.name = builder.name;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateEventBridgeIntegrationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessKey
     */
    public String getAccessKey() {
        return this.accessKey;
    }

    /**
     * @return accessSecret
     */
    public String getAccessSecret() {
        return this.accessSecret;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return eventBusName
     */
    public String getEventBusName() {
        return this.eventBusName;
    }

    /**
     * @return eventBusRegionId
     */
    public String getEventBusRegionId() {
        return this.eventBusRegionId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<CreateOrUpdateEventBridgeIntegrationRequest, Builder> {
        private String accessKey; 
        private String accessSecret; 
        private String description; 
        private String endpoint; 
        private String eventBusName; 
        private String eventBusRegionId; 
        private Long id; 
        private String name; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrUpdateEventBridgeIntegrationRequest request) {
            super(request);
            this.accessKey = request.accessKey;
            this.accessSecret = request.accessSecret;
            this.description = request.description;
            this.endpoint = request.endpoint;
            this.eventBusName = request.eventBusName;
            this.eventBusRegionId = request.eventBusRegionId;
            this.id = request.id;
            this.name = request.name;
            this.source = request.source;
        } 

        /**
         * AccessKey.
         */
        public Builder accessKey(String accessKey) {
            this.putBodyParameter("AccessKey", accessKey);
            this.accessKey = accessKey;
            return this;
        }

        /**
         * AccessSecret.
         */
        public Builder accessSecret(String accessSecret) {
            this.putBodyParameter("AccessSecret", accessSecret);
            this.accessSecret = accessSecret;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.putBodyParameter("Endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * EventBusName.
         */
        public Builder eventBusName(String eventBusName) {
            this.putBodyParameter("EventBusName", eventBusName);
            this.eventBusName = eventBusName;
            return this;
        }

        /**
         * EventBusRegionId.
         */
        public Builder eventBusRegionId(String eventBusRegionId) {
            this.putBodyParameter("EventBusRegionId", eventBusRegionId);
            this.eventBusRegionId = eventBusRegionId;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putBodyParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public CreateOrUpdateEventBridgeIntegrationRequest build() {
            return new CreateOrUpdateEventBridgeIntegrationRequest(this);
        } 

    } 

}
