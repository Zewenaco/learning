package com.zewenaco.grpc.grpcclient.infrastructure.in.api.controller;

import com.zewenaco.grpc.grpcclient.infrastructure.in.api.dto.ProductDtoResponse;
import com.zewenaco.grpc.grpcclient.infrastructure.out.grpc.client.ProductClientService;
import com.zewenaco.grpc.infrastructure.product.in.protobuf.ProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductClientService productClientService;

    @Autowired
    public ProductController(ProductClientService productClientService) {
        this.productClientService = productClientService;
    }

    @GetMapping("/{id}")
    public ProductDtoResponse getProduct(@PathVariable(name = "id") Long id) {
        var productResponseProto = productClientService.getProduct(ProductRequest.newBuilder().setId(id).build());
        return new ProductDtoResponse(productResponseProto.getId(), productResponseProto.getName());
    }
}
