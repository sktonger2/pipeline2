

def Boolean validateEpochTime(String epochTime){
    def match = epochTime =~ '^[0-9]*$'
    if(match){
        return true
    }else{
        return false
    }

}

def validateTime(){

    def startTime = "${params.START_DATETIME}"
    def endTime = "${params.END_DATETIME}"
    if(validateEpochTime(startTime) == flase){
        echo "validation falied , epoch start time is not correct"
    }
    if(validateEpochTime(endTime) == flase){
        echo "validation falied , epoch start time is not correct"
    }

}


return this
