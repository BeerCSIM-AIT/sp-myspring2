package nvc.it.myspring2.controller

import nvc.it.myspring2.model.Product
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
@RestController
@RequestMapping("/products")
class ProductController {
    @GetMapping("")
    fun getProducts(@RequestParam(name="status", required=false) status:String="active"): String {
        return "All products, status = $status";
    }

    @PostMapping("")
    fun createProduct(@RequestBody product:Product): Product {
        println(product);
        return product;
    }
    //1
    @PutMapping("/{id}")
    fun editProduct(@PathVariable("id") id:Int, @RequestBody product: Product): Product {
        return product;
    }
    //2
    @PatchMapping("/{id}")
    fun patchProduct(@PathVariable("id") id:Int): String {
        return "Patch Product id $id";
    }
    //3
    @GetMapping("/name/{name}")
    fun getProductsByName(@PathVariable("name") name:String): String {
        return "Product with name: $name";
    }
}