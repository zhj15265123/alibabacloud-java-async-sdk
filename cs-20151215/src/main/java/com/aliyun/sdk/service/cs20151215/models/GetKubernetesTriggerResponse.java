// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetKubernetesTriggerResponse} extends {@link TeaModel}
 *
 * <p>GetKubernetesTriggerResponse</p>
 */
public class GetKubernetesTriggerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private java.util.List < GetKubernetesTriggerResponseBody> body;

    private GetKubernetesTriggerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetKubernetesTriggerResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public java.util.List < GetKubernetesTriggerResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetKubernetesTriggerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(java.util.List < GetKubernetesTriggerResponseBody> body);

        @Override
        GetKubernetesTriggerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetKubernetesTriggerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private java.util.List < GetKubernetesTriggerResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetKubernetesTriggerResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(java.util.List < GetKubernetesTriggerResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public GetKubernetesTriggerResponse build() {
            return new GetKubernetesTriggerResponse(this);
        } 

    } 

    public static class GetKubernetesTriggerResponseBody extends TeaModel {
        @NameInMap("id")
        private String id;

        @NameInMap("name")
        private String name;

        @NameInMap("cluster_id")
        private String clusterId;

        @NameInMap("project_id")
        private String projectId;

        @NameInMap("type")
        private String type;

        @NameInMap("action")
        private String action;

        @NameInMap("token")
        private String token;

        private GetKubernetesTriggerResponseBody(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.clusterId = builder.clusterId;
            this.projectId = builder.projectId;
            this.type = builder.type;
            this.action = builder.action;
            this.token = builder.token;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetKubernetesTriggerResponseBody create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private String clusterId; 
            private String projectId; 
            private String type; 
            private String action; 
            private String token; 

            /**
             * The ID of the trigger.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the trigger.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the associated cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The name of the project.
             * <p>
             * 
             * The name consists of the namespace where the application is deployed and the name of the application. The format is `${namespace}/${name}`. Example: default/test-app.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The type of trigger.
             * <p>
             * 
             * Valid values:
             * 
             * *   `deployment`: performs actions on Deployments.
             * *   `application`: performs actions on applications that are deployed in Application Center.
             * 
             * Default value: `deployment`.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The action that the trigger performs. The value is set to redeploy.
             * <p>
             * 
             * `redeploy`: redeploys the resource specified by project_id.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Token
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            public GetKubernetesTriggerResponseBody build() {
                return new GetKubernetesTriggerResponseBody(this);
            } 

        } 

    }
}
