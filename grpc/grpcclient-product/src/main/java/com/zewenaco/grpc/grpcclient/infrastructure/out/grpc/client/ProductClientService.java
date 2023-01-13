package com.zewenaco.grpc.grpcclient.infrastructure.out.grpc.client;

import com.zewenaco.grpc.infrastructure.product.in.protobuf.ProductRequest;
import com.zewenaco.grpc.infrastructure.product.in.protobuf.ProductResponse;
import com.zewenaco.grpc.infrastructure.product.in.protobuf.ProductServiceGrpc.ProductServiceBlockingStub;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class ProductClientService {

    @GrpcClient("product-service")
    private ProductServiceBlockingStub productServiceBlockingStub;

    public ProductResponse getProduct(ProductRequest productRequest) {
        return this.productServiceBlockingStub.getProduct(productRequest);
    }
}
