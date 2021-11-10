export function setSelect(number, dataSet) {
    const wrongSet = dataSet[number].incorrect_answers;
    
    
    const result = wrongSet.map((info) => {
        const startError = info.indexOf("&");
        const finError = info.indexOf(";");
        
        if(startError) {
            const fix = info.substr(0, startError);
            fix = fix + info.substr(finError+1, info.length);
            return fix;
        } 
        return info;
    });

    return result;
}