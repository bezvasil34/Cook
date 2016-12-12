$('.message a').click(function(){
    $('.register-form').animate({height: "toggle",opacity: "toggle"}, "slow");
    $('.login-form').animate({height: "toggle",opacity: "toggle"}, "slow");
});


/*
 <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
var app=angular.module('myApp',[])
app.controller('mainCtrl',function ($http) {
    var vm=this;
    $http.get('/getIngredients').then(function (res) {
        vm.ingredients=res.data;
        console.log(res);
    })
});

<div style="background-color: white">
    <ul>
    <li ng-repeat="ingredient in ctrl.ingredients | filter: ctrl.search">
    {{ingredient}}
</li>
</ul>
</div>


 //    @RequestMapping(value ="/getIngredients", method = RequestMethod.GET)
 //    public @ResponseBody String [] findAllIngredients(){
 //        List<Ingredient> ingredientsFromDB = ingredientService.findAll();
 //
 //        String [] ingredients = new String [ingredientsFromDB.size()];
 //
 //        for (int i = 0; i < ingredientsFromDB.size(); i++) {
 //            ingredients[i] = ingredientsFromDB.get(i).getName();
 //        }
 //
 //        return ingredients;
 //    }



*/
