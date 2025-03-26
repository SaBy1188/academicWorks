function output(data) {
    console.log(data);
    const el = document.createElement("pre");
    el.textContent = data;
    document.body.append(el);
}