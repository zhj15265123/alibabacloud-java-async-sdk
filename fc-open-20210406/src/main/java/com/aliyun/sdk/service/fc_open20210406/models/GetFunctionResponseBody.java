// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFunctionResponseBody} extends {@link TeaModel}
 *
 * <p>GetFunctionResponseBody</p>
 */
public class GetFunctionResponseBody extends TeaModel {
    @NameInMap("caPort")
    private Integer caPort;

    @NameInMap("codeChecksum")
    private String codeChecksum;

    @NameInMap("codeSize")
    private Long codeSize;

    @NameInMap("cpu")
    private Float cpu;

    @NameInMap("createdTime")
    private String createdTime;

    @NameInMap("customContainerConfig")
    private CustomContainerConfigInfo customContainerConfig;

    @NameInMap("customDNS")
    private CustomDNS customDNS;

    @NameInMap("customHealthCheckConfig")
    private CustomHealthCheckConfig customHealthCheckConfig;

    @NameInMap("customRuntimeConfig")
    private CustomRuntimeConfig customRuntimeConfig;

    @NameInMap("description")
    private String description;

    @NameInMap("diskSize")
    private Integer diskSize;

    @NameInMap("environmentVariables")
    private java.util.Map < String, String > environmentVariables;

    @NameInMap("functionId")
    private String functionId;

    @NameInMap("functionName")
    private String functionName;

    @NameInMap("gpuMemorySize")
    private Integer gpuMemorySize;

    @NameInMap("handler")
    private String handler;

    @NameInMap("initializationTimeout")
    private Integer initializationTimeout;

    @NameInMap("initializer")
    private String initializer;

    @NameInMap("instanceConcurrency")
    private Integer instanceConcurrency;

    @NameInMap("instanceLifecycleConfig")
    private InstanceLifecycleConfig instanceLifecycleConfig;

    @NameInMap("instanceSoftConcurrency")
    private Integer instanceSoftConcurrency;

    @NameInMap("instanceType")
    private String instanceType;

    @NameInMap("lastModifiedTime")
    private String lastModifiedTime;

    @NameInMap("layers")
    private java.util.List < String > layers;

    @NameInMap("layersArnV2")
    private java.util.List < String > layersArnV2;

    @NameInMap("memorySize")
    private Integer memorySize;

    @NameInMap("runtime")
    private String runtime;

    @NameInMap("timeout")
    private Integer timeout;

    private GetFunctionResponseBody(Builder builder) {
        this.caPort = builder.caPort;
        this.codeChecksum = builder.codeChecksum;
        this.codeSize = builder.codeSize;
        this.cpu = builder.cpu;
        this.createdTime = builder.createdTime;
        this.customContainerConfig = builder.customContainerConfig;
        this.customDNS = builder.customDNS;
        this.customHealthCheckConfig = builder.customHealthCheckConfig;
        this.customRuntimeConfig = builder.customRuntimeConfig;
        this.description = builder.description;
        this.diskSize = builder.diskSize;
        this.environmentVariables = builder.environmentVariables;
        this.functionId = builder.functionId;
        this.functionName = builder.functionName;
        this.gpuMemorySize = builder.gpuMemorySize;
        this.handler = builder.handler;
        this.initializationTimeout = builder.initializationTimeout;
        this.initializer = builder.initializer;
        this.instanceConcurrency = builder.instanceConcurrency;
        this.instanceLifecycleConfig = builder.instanceLifecycleConfig;
        this.instanceSoftConcurrency = builder.instanceSoftConcurrency;
        this.instanceType = builder.instanceType;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.layers = builder.layers;
        this.layersArnV2 = builder.layersArnV2;
        this.memorySize = builder.memorySize;
        this.runtime = builder.runtime;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFunctionResponseBody create() {
        return builder().build();
    }

    /**
     * @return caPort
     */
    public Integer getCaPort() {
        return this.caPort;
    }

    /**
     * @return codeChecksum
     */
    public String getCodeChecksum() {
        return this.codeChecksum;
    }

    /**
     * @return codeSize
     */
    public Long getCodeSize() {
        return this.codeSize;
    }

    /**
     * @return cpu
     */
    public Float getCpu() {
        return this.cpu;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return customContainerConfig
     */
    public CustomContainerConfigInfo getCustomContainerConfig() {
        return this.customContainerConfig;
    }

    /**
     * @return customDNS
     */
    public CustomDNS getCustomDNS() {
        return this.customDNS;
    }

    /**
     * @return customHealthCheckConfig
     */
    public CustomHealthCheckConfig getCustomHealthCheckConfig() {
        return this.customHealthCheckConfig;
    }

    /**
     * @return customRuntimeConfig
     */
    public CustomRuntimeConfig getCustomRuntimeConfig() {
        return this.customRuntimeConfig;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return diskSize
     */
    public Integer getDiskSize() {
        return this.diskSize;
    }

    /**
     * @return environmentVariables
     */
    public java.util.Map < String, String > getEnvironmentVariables() {
        return this.environmentVariables;
    }

    /**
     * @return functionId
     */
    public String getFunctionId() {
        return this.functionId;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return gpuMemorySize
     */
    public Integer getGpuMemorySize() {
        return this.gpuMemorySize;
    }

    /**
     * @return handler
     */
    public String getHandler() {
        return this.handler;
    }

    /**
     * @return initializationTimeout
     */
    public Integer getInitializationTimeout() {
        return this.initializationTimeout;
    }

    /**
     * @return initializer
     */
    public String getInitializer() {
        return this.initializer;
    }

    /**
     * @return instanceConcurrency
     */
    public Integer getInstanceConcurrency() {
        return this.instanceConcurrency;
    }

    /**
     * @return instanceLifecycleConfig
     */
    public InstanceLifecycleConfig getInstanceLifecycleConfig() {
        return this.instanceLifecycleConfig;
    }

    /**
     * @return instanceSoftConcurrency
     */
    public Integer getInstanceSoftConcurrency() {
        return this.instanceSoftConcurrency;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @return layers
     */
    public java.util.List < String > getLayers() {
        return this.layers;
    }

    /**
     * @return layersArnV2
     */
    public java.util.List < String > getLayersArnV2() {
        return this.layersArnV2;
    }

    /**
     * @return memorySize
     */
    public Integer getMemorySize() {
        return this.memorySize;
    }

    /**
     * @return runtime
     */
    public String getRuntime() {
        return this.runtime;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    public static final class Builder {
        private Integer caPort; 
        private String codeChecksum; 
        private Long codeSize; 
        private Float cpu; 
        private String createdTime; 
        private CustomContainerConfigInfo customContainerConfig; 
        private CustomDNS customDNS; 
        private CustomHealthCheckConfig customHealthCheckConfig; 
        private CustomRuntimeConfig customRuntimeConfig; 
        private String description; 
        private Integer diskSize; 
        private java.util.Map < String, String > environmentVariables; 
        private String functionId; 
        private String functionName; 
        private Integer gpuMemorySize; 
        private String handler; 
        private Integer initializationTimeout; 
        private String initializer; 
        private Integer instanceConcurrency; 
        private InstanceLifecycleConfig instanceLifecycleConfig; 
        private Integer instanceSoftConcurrency; 
        private String instanceType; 
        private String lastModifiedTime; 
        private java.util.List < String > layers; 
        private java.util.List < String > layersArnV2; 
        private Integer memorySize; 
        private String runtime; 
        private Integer timeout; 

        /**
         * The list of layers (ARN V1 version).
         * <p>
         * 
         * > If multiple layers exist, the layers are merged based on the order of array subscripts. The content of a layer with a smaller subscript overwrites the file with the same name in the layer with a larger subscript. >
         * 
         * **
         * 
         * **Warning:** This parameter is to be deprecated. Use layersArnV2.
         */
        public Builder caPort(Integer caPort) {
            this.caPort = caPort;
            return this;
        }

        /**
         * The time when the function was created.
         */
        public Builder codeChecksum(String codeChecksum) {
            this.codeChecksum = codeChecksum;
            return this;
        }

        /**
         * The description of the function.
         */
        public Builder codeSize(Long codeSize) {
            this.codeSize = codeSize;
            return this;
        }

        /**
         * The GPU memory capacity for the function. Unit: MB. The memory capacity must be a multiple of 1024 MB.
         */
        public Builder cpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * The environment variables that are configured for the function. You can obtain the values of the environment variables from the function. For more information, see [Environment variables](~~69777~~).
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * The name of the layer resource (ARN V1 version).
         */
        public Builder customContainerConfig(CustomContainerConfigInfo customContainerConfig) {
            this.customContainerConfig = customContainerConfig;
            return this;
        }

        /**
         * The custom health check configuration of the function. This parameter is applicable only to custom runtimes and custom containers.
         */
        public Builder customDNS(CustomDNS customDNS) {
            this.customDNS = customDNS;
            return this;
        }

        /**
         * The name of the layer resource (ARN V2 version).
         */
        public Builder customHealthCheckConfig(CustomHealthCheckConfig customHealthCheckConfig) {
            this.customHealthCheckConfig = customHealthCheckConfig;
            return this;
        }

        /**
         * The list of layers (ARN V2 version).
         * <p>
         * 
         * > If multiple layers exist, the layers are merged based on the order of array subscripts. The content of a layer with a smaller subscript overwrites the file that has the same name and a larger subscript in the layer.
         */
        public Builder customRuntimeConfig(CustomRuntimeConfig customRuntimeConfig) {
            this.customRuntimeConfig = customRuntimeConfig;
            return this;
        }

        /**
         * The environment variables that you configured for the function.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * function的磁盘规格，单位为MB，可选值为512MB或10240MB
         */
        public Builder diskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }

        /**
         * The ID that is generated by the system for the function. Each function ID is unique in Function Compute.
         */
        public Builder environmentVariables(java.util.Map < String, String > environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * The handler of the function. For more information, see [Function handler](~~157704~~).
         */
        public Builder functionId(String functionId) {
            this.functionId = functionId;
            return this;
        }

        /**
         * The time when the function was last modified.
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * function的GPU显存规格，单位为MB，为1024MB的倍数
         */
        public Builder gpuMemorySize(Integer gpuMemorySize) {
            this.gpuMemorySize = gpuMemorySize;
            return this;
        }

        /**
         * The memory size for the function. Unit: MB. The memory size must be a multiple of 64 MB. The memory size varies based on the function instance type. For more information, see [Instance types](~~179379~~).
         */
        public Builder handler(String handler) {
            this.handler = handler;
            return this;
        }

        /**
         * The port on which the HTTP server listens for the custom runtime or custom container runtime.
         */
        public Builder initializationTimeout(Integer initializationTimeout) {
            this.initializationTimeout = initializationTimeout;
            return this;
        }

        /**
         * The configurations of the custom container runtime. After you configure the custom container runtime, Function Compute can execute the function in a container created from a custom image.
         */
        public Builder initializer(String initializer) {
            this.initializer = initializer;
            return this;
        }

        /**
         * The instance type of the function. Valid values:
         * <p>
         * 
         * *   **e1**: elastic instance
         * *   **c1**: performance instance
         * *   **fc.gpu.tesla.1**: GPU-accelerated instances (Tesla T4)
         * *   **fc.gpu.ampere.1**: GPU-accelerated instances (Ampere A10)
         * *   **g1**: same fc.gpu.tesla.1
         */
        public Builder instanceConcurrency(Integer instanceConcurrency) {
            this.instanceConcurrency = instanceConcurrency;
            return this;
        }

        /**
         * The configurations of the custom runtime.
         */
        public Builder instanceLifecycleConfig(InstanceLifecycleConfig instanceLifecycleConfig) {
            this.instanceLifecycleConfig = instanceLifecycleConfig;
            return this;
        }

        /**
         * The lifecycle configurations of the instance.
         */
        public Builder instanceSoftConcurrency(Integer instanceSoftConcurrency) {
            this.instanceSoftConcurrency = instanceSoftConcurrency;
            return this;
        }

        /**
         * The custom DNS configurations of the function.
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The runtime environment of the function. Valid values: **nodejs16**, **nodejs14**, **nodejs12**, **nodejs10**, **nodejs8**, **nodejs6**, **nodejs4.4**, **python3.9**, **python3**, **python2.7**, **java11**, **java8**, **go1**, **php7.2**, **dotnetcore2.1**, **custom**, and **custom-container**.
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * The number of requests that can be concurrently processed by a single instance.
         */
        public Builder layers(java.util.List < String > layers) {
            this.layers = layers;
            return this;
        }

        /**
         * The number of vCPUs of the function. The value must be a multiple of 0.05.
         */
        public Builder layersArnV2(java.util.List < String > layersArnV2) {
            this.layersArnV2 = layersArnV2;
            return this;
        }

        /**
         * The timeout period for the execution of the function. Unit: seconds. Default value: 60. Valid values: 1 to 600. When this period expires, the execution of the function is terminated.
         */
        public Builder memorySize(Integer memorySize) {
            this.memorySize = memorySize;
            return this;
        }

        /**
         * The timeout period for the execution of the initializer function. Unit: seconds. Default value: 3. Valid values: 1 to 300. When this period ends, the execution of the initializer function is terminated.
         */
        public Builder runtime(String runtime) {
            this.runtime = runtime;
            return this;
        }

        /**
         * The handler of the initializer function. The format of the value is determined by the programming language that you use. For more information, see [Initializer function](~~157704~~).
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public GetFunctionResponseBody build() {
            return new GetFunctionResponseBody(this);
        } 

    } 

}
