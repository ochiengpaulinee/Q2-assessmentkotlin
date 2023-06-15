
//Question1
fun main() {
    var ancestor = AncestralStories("2 hours","respect","youths")
    ancestor.story()
    var storyy = StoryTeller("1hour" ,"duties","children","women")
    storyy.tellStory()

    var translating = Translator("3HOURS","community","Xhosa")
    translating.translation()


    var cuisine = AfricanCuisine("tomato","45 minutes","boiling","high energy")
    cuisine.cooking()

    var recipess = EthpoianRecipe("spices","2 hours","fermenting","low","sweet")
    recipess.ethopia()

    var niger = NigerianRecipe("meat","1 hour","energy","boiling","soft")
    niger.nigeria()

    var morocco1 = MoroccanRecipe("beans","1.5 hours","high","stir","Morocco")
    morocco1.morocco()
}

open class AncestralStories(var length:String,var moralLesson:String,var ageGroup:String){
    fun story(){
        println("Most of the stories took ${length} and the moral lesson was ${moralLesson}")
    }
}

class StoryTeller(length: String,moralLesson: String,ageGroup: String,var person:String):AncestralStories(length,moralLesson,ageGroup){
    fun tellStory(){
        println("Each age group has its own ${person} who told them story with different ${moralLesson}")
    }
}

class Translator(length: String,moralLesson: String,var translate:String):AncestralStories(length,moralLesson,translate){
    fun translation(){
        println("For the stories that require translation, they took ${length},moral of the story was ${moralLesson} and was translated from zulu to ${translate}")
    }
}

//Question2

open class AfricanCuisine(var ingredients:String,var preparationTime:String,var cookingMethod:String,var nutritionalValue:String){
    fun cooking(){
        println("most African foods use ${ingredients} which approximately take ${preparationTime} to cook. It has ${nutritionalValue} value")
    }
}

class EthpoianRecipe(ingredients: String, preparationTime:String, cookingMethod: String, nutritionalValue: String,
                     private var taste:String):AfricanCuisine(ingredients,preparationTime,cookingMethod, nutritionalValue){
    fun ethopia(){
        println("For Ethopian food it takes ${preparationTime} to prepare, it has a ${taste} taste")
    }
}

class MoroccanRecipe(ingredients: String,preparationTime: String,nutritionalValue: String,cookingMethod: String,var country:String):AfricanCuisine(ingredients,cookingMethod,nutritionalValue,preparationTime){
    fun morocco(){
        println("This food takes ${preparationTime} to prepare, it has a ${nutritionalValue} value and it's from ${country}")
    }
}


class NigerianRecipe(ingredients: String,preparationTime: String,nutritionalValue: String,cookingMethod: String,var texture:String):AfricanCuisine(ingredients,cookingMethod,nutritionalValue,preparationTime){
    fun nigeria(){
        println("The Nigerian food takes ${preparationTime} to prepare, it has a ${nutritionalValue} amd it has a very ${texture} texture")
    }
}


//Question3

