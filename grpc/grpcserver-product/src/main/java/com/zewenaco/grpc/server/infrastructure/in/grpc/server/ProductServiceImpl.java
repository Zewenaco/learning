package com.zewenaco.grpc.server.infrastructure.in.grpc.server;

import com.zewenaco.grpc.infrastructure.product.in.protobuf.ProductRequest;
import com.zewenaco.grpc.infrastructure.product.in.protobuf.ProductResponse;
import com.zewenaco.grpc.infrastructure.product.in.protobuf.ProductServiceGrpc.ProductServiceImplBase;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class ProductServiceImpl extends ProductServiceImplBase {

    @Override
    public void getProduct(ProductRequest request, StreamObserver<ProductResponse> responseObserver) {
        responseObserver.onNext(ProductResponse.newBuilder()
                .setId(1L)
                .setName("Product").build());
        responseObserver.onCompleted();
    }
}
